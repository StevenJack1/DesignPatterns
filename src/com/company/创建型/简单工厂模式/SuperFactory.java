package com.company.������.�򵥹���ģʽ;


public class SuperFactory {

    public static Super createSuper(String operate){
        Super oper = null;

        // ʹ�÷��似�����޸�switch
        String className = "com.company.������.�򵥹���ģʽ." + operate;
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
