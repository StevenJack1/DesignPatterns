package com.company.��Ϊ��.������ģʽ.ԭ��;

public class Main {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new ConcreteElementA("yzf"));
        objectStructure.attach(new ConcreteElementB("hhah"));

        ConcreteVisitor1 concreteVisitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 concreteVisitor2 = new ConcreteVisitor2();

        objectStructure.accept(concreteVisitor1);
        objectStructure.accept(concreteVisitor2);
    }
}
