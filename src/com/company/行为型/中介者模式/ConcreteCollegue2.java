package com.company.行为型.中介者模式;

public class ConcreteCollegue2 extends Colleague {

    public ConcreteCollegue2(Mediator mediator) {
        super(mediator);
    }


    public void send(String message){
        mediator.send(message,this);
    }

    public void notify1(String message){
        System.out.println("同时2获得消息："+message);
    }
}
