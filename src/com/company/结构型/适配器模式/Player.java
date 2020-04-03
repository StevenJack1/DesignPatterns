package com.company.结构型.适配器模式;

public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void defense();
}
