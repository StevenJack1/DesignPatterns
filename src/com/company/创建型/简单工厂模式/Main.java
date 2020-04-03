package com.company.创建型.简单工厂模式;

public class Main {
    public static void main(String[] args) {
        Super temp = null;
        temp = SuperFactory.createSuper("Mul");
        temp.numberA = 1;
        temp.numberB = 0;
        try {
            System.out.println(temp.getResult());
        } catch (Exception e){
            System.out.println("出问题了");
        }

    }

}
