package com.company.结构型.适配器模式;

public class HouWei extends Player {

    public HouWei(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(this.name+"后卫进攻");
    }

    @Override
    public void defense() {
        System.out.println(this.name+"后卫防守");
    }
}
