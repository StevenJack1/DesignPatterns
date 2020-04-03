package com.company.行为型.中介者模式;

public class ConcreteMediator extends Mediator {

    private ConcreteCollegue1 concreteCollegue1;
    private ConcreteCollegue2 concreteCollegue2;

    public void setConcreteCollegue1(ConcreteCollegue1 concreteCollegue1) {
        this.concreteCollegue1 = concreteCollegue1;
    }

    public void setConcreteCollegue2(ConcreteCollegue2 concreteCollegue2) {
        this.concreteCollegue2 = concreteCollegue2;
    }

    @Override
    public void send(String message, Colleague c) {
        if (c == concreteCollegue1){
            concreteCollegue2.notify1(message);
        } else {
            concreteCollegue1.notify1(message);
        }
    }
}
