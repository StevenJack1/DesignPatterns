package com.company.�ṹ��.������ģʽ;

public class FanYi extends Player {
    private WaiJi waiJi = new WaiJi();

    public FanYi(String name) {
        super(name);
        waiJi.setName(name);

    }

    @Override
    public void attack() {
        waiJi.attack1();
    }

    @Override
    public void defense() {
        waiJi.defense1();
    }
}
