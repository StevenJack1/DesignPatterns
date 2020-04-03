package com.company.创建型.工厂方法模式;

public class Main {
    public static void main(String[] args) {

        IFactory addFactory = new AddFactory();
        Super aSuper = addFactory.createSuper();
        aSuper.numberA = 1;
        aSuper.numberB = 1;
        try {
            System.out.println(aSuper.getResult());
        } catch (Exception e){
            System.out.println("出问题了");
        }

    }

}
