package com.company.创建型.原型模式;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype resume = new ConcretePrototype("yzf", 11, "nan");
        Prototype prototype = resume.myClone();
        System.out.println(prototype);
    }
}
