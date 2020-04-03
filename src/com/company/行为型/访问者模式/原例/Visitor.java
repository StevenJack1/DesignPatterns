package com.company.行为型.访问者模式.原例;

/**
 * 为该对象结构中的ConcreteElement的每一个类声明一个Visit操作
 */
public abstract class Visitor {
    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
