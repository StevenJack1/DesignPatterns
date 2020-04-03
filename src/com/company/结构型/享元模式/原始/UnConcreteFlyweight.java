package com.company.结构型.享元模式.原始;

public class UnConcreteFlyweight extends Flyweight {
    private String name;

    public UnConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
        public void operation() {
        System.out.println("不共享flyweight:"+name);
    }
}
