package com.company.��Ϊ��.�н���ģʽ;

public class ConcreteCollegue1 extends Colleague {

    public ConcreteCollegue1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notify1(String message){
        System.out.println("ͬʱ1�����Ϣ��"+message);
    }
}
