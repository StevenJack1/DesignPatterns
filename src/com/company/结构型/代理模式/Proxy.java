package com.company.�ṹ��.����ģʽ;

public class Proxy implements GiveGift {
    private Pursite pursite;

    public Proxy(Girl girl) {
        pursite = new Pursite(girl);
    }

    @Override
    public void giveFlower() {
        pursite.giveFlower();
    }

    @Override
    public void giveDoll() {
        pursite.giveDoll();
    }

    @Override
    public void giveChocolate() {
        pursite.giveChocolate();
    }
}
