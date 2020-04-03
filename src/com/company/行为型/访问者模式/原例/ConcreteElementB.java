package com.company.行为型.访问者模式.原例;

public class ConcreteElementB extends Element {
    private String name;

    public ConcreteElementB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);

    }
}
