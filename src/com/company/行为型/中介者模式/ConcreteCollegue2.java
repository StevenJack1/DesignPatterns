package com.company.��Ϊ��.�н���ģʽ;

public class ConcreteCollegue2 extends Colleague {

    public ConcreteCollegue2(Mediator mediator) {
        super(mediator);
    }


    public void send(String message){
        mediator.send(message,this);
    }

    public void notify1(String message){
        System.out.println("ͬʱ2�����Ϣ��"+message);
    }
}
