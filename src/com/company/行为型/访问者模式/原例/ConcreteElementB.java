package com.company.��Ϊ��.������ģʽ.ԭ��;

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
