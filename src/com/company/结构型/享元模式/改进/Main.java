package com.company.结构型.享元模式.改进;

public class Main {


    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight boke = flyweightFactory.getFlyWeight("博客");
        boke.operation(new User("yzf"));

        Flyweight boke2 = flyweightFactory.getFlyWeight("博客");
        boke2.operation(new User("asdasd"));

        Flyweight chanp = flyweightFactory.getFlyWeight("产品");
        chanp.operation(new User("qweqwe"));

        Flyweight chanp2 = flyweightFactory.getFlyWeight("产品");
        chanp2.operation(new User("xvxcvxc"));

        int count = flyweightFactory.getCount();
        System.out.println(count);
    }
}
