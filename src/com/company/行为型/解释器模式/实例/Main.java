package com.company.行为型.解释器模式.实例;

/**
 * 构建表示该文法定义的语言中一个特定的句子的抽象语法树。
 * 调用解释操作
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setText("O 3 E 5 G 5 A 3");

        AbstractExpression abstractExpression = null;

        try {
            while (context.getText().length() > 0){
                String str = context.getText().substring(0,1);
                switch (str){
                    case "O":
                        abstractExpression = new Scale();
                        break;
                    case "C":
                    case "D":
                    case "E":
                    case "F":
                    case "G":
                    case "A":
                    case "B":
                    case "P":
                        abstractExpression = new Note();
                        break;
                    default:
                        break;
                }
                abstractExpression.interpret(context);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
