package com.company.结构型.代理模式;

public class Pursite implements GiveGift {
    private Girl girl;

    public Pursite(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveFlower() {
        System.out.println(girl.getName() + "送你花");
    }

    @Override
    public void giveDoll() {
        System.out.println(girl.getName() + "送你洋娃娃");

    }

    @Override
    public void giveChocolate() {
        System.out.println(girl.getName() + "送你巧克力");

    }
}
