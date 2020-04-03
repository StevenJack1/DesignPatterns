package com.company.结构型.享元模式.改进;

public class UnConcreteFlyweight extends Flyweight {
    private String name;

    public UnConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void operation(User user) {
        System.out.println("不共享flyweight:"+name+ "用户威："+user.getName());
    }
}
