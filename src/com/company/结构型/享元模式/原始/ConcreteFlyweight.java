package com.company.结构型.享元模式.原始;

public class ConcreteFlyweight extends Flyweight {

    private String name;

    public ConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("共享flyweight:"+name);
    }
}
