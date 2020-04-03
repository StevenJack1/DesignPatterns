package com.company.行为型.中介者模式;

// 抽象中介者
public abstract class Mediator {

    public abstract void send(String message,Colleague c);

}
