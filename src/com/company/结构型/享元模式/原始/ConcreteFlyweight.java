package com.company.�ṹ��.��Ԫģʽ.ԭʼ;

public class ConcreteFlyweight extends Flyweight {

    private String name;

    public ConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("����flyweight:"+name);
    }
}
