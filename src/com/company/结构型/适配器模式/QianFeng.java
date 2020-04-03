package com.company.结构型.适配器模式;

public class QianFeng extends Player {

    public QianFeng(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(this.name+"前锋进攻！");
    }

    @Override
    public void defense() {
        System.out.println(this.name+"前锋防守！");
    }
}
