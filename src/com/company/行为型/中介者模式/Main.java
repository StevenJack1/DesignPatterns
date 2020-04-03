package com.company.行为型.中介者模式;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();

        ConcreteCollegue1 concreteCollegue1 = new ConcreteCollegue1(concreteMediator);
        ConcreteCollegue2 concreteCollegue2 = new ConcreteCollegue2(concreteMediator);

        concreteMediator.setConcreteCollegue1(concreteCollegue1);
        concreteMediator.setConcreteCollegue2(concreteCollegue2);

        concreteCollegue1.send("吃过饭了嘛");
        concreteCollegue2.send("吃了");
    }
}
