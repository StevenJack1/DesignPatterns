package com.company.行为型.访问者模式.原例;

/**
 * 定义一个accept方法，它以一个访问者为参数
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
