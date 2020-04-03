package com.company.行为型.中介者模式;

public class ConcreteCollegue1 extends Colleague {

    public ConcreteCollegue1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notify1(String message){
        System.out.println("同时1获得消息："+message);
    }
}
