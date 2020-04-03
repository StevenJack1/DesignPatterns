package com.company.行为型.解释器模式.原例;

import java.util.ArrayList;

/**
 * 构建表示该文法定义的语言中一个特定的句子的抽象语法树。
 * 调用解释操作
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        ArrayList<AbstractExpression> list  = new ArrayList<>();

        list.add(new TermianlExpression());
        list.add(new NontermianlExpression());
        list.add(new TermianlExpression());
        list.add(new TermianlExpression());

        for (AbstractExpression abstractExpression:list){
            abstractExpression.interpret(context);
        }
    }
}
