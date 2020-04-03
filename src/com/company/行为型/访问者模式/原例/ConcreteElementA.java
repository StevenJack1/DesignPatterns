package com.company.行为型.访问者模式.原例;

/**
 * 实现accept操作
 * 利用双分派技术，实现处理与数据结构的分离
 */
public class ConcreteElementA extends Element {
    private String name;

    public ConcreteElementA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
