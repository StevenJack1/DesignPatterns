package com.company.�ṹ��.����ģʽ;

public class Pursite implements GiveGift {
    private Girl girl;

    public Pursite(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveFlower() {
        System.out.println(girl.getName() + "���㻨");
    }

    @Override
    public void giveDoll() {
        System.out.println(girl.getName() + "����������");

    }

    @Override
    public void giveChocolate() {
        System.out.println(girl.getName() + "�����ɿ���");

    }
}
