package com.company.������.ԭ��ģʽ;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype resume = new ConcretePrototype("yzf", 11, "nan");
        Prototype prototype = resume.myClone();
        System.out.println(prototype);
    }
}
