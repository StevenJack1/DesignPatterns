package com.company.�ṹ��.��Ԫģʽ.�Ľ�;

public class Main {


    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight boke = flyweightFactory.getFlyWeight("����");
        boke.operation(new User("yzf"));

        Flyweight boke2 = flyweightFactory.getFlyWeight("����");
        boke2.operation(new User("asdasd"));

        Flyweight chanp = flyweightFactory.getFlyWeight("��Ʒ");
        chanp.operation(new User("qweqwe"));

        Flyweight chanp2 = flyweightFactory.getFlyWeight("��Ʒ");
        chanp2.operation(new User("xvxcvxc"));

        int count = flyweightFactory.getCount();
        System.out.println(count);
    }
}
