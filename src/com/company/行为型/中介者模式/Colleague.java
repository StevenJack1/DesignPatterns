package com.company.行为型.中介者模式;

// 抽象同事类
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
