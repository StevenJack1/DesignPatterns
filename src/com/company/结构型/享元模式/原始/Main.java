package com.company.�ṹ��.��Ԫģʽ.ԭʼ;

public class Main {


    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight boke = flyweightFactory.getFlyWeight("����");
        boke.operation();

        Flyweight boke2 = flyweightFactory.getFlyWeight("����");
        boke2.operation();

        Flyweight chanp = flyweightFactory.getFlyWeight("��Ʒ");
        chanp.operation();

        Flyweight chanp2 = flyweightFactory.getFlyWeight("��Ʒ");
        chanp2.operation();

        int count = flyweightFactory.getCount();
        System.out.println(count);
    }
}
