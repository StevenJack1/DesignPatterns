package com.company.�ṹ��.��Ԫģʽ.ԭʼ;

public class UnConcreteFlyweight extends Flyweight {
    private String name;

    public UnConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
        public void operation() {
        System.out.println("������flyweight:"+name);
    }
}
