package com.company.创建型.简单工厂模式;


public class SuperFactory {

    public static Super createSuper(String operate){
        Super oper = null;

        // 使用反射技术来修改switch
        String className = "com.company.创建型.简单工厂模式." + operate;
        try {
            oper = (Super) Class.forName(className).newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }
//        switch(operate){
//            case "+":
//                oper = new Add();
//                break;
//            case "-":
//                oper = new Sub();
//                break;
//            case "*":
//                oper = new Mul();
//                break;
//            case "/":
//                oper = new Div();
//                break;
//        }
        return oper;
    }
}
