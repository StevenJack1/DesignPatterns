package com.company.结构型.享元模式.原始;

public class Main {


    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight boke = flyweightFactory.getFlyWeight("博客");
        boke.operation();

        Flyweight boke2 = flyweightFactory.getFlyWeight("博客");
        boke2.operation();

        Flyweight chanp = flyweightFactory.getFlyWeight("产品");
        chanp.operation();

        Flyweight chanp2 = flyweightFactory.getFlyWeight("产品");
        chanp2.operation();

        int count = flyweightFactory.getCount();
        System.out.println(count);
    }
}
