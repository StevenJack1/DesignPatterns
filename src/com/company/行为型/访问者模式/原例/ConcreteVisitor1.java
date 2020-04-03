package com.company.行为型.访问者模式.原例;

/**
 * 具体访问者，实现每个由Visitor声明的操作。每个操作实现算法的一部分，
 * 而该算法片段乃是对应于结构中对象的类
 */
public class ConcreteVisitor1 extends Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getName()+"访问A");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getName()+"访问B");
    }
}
