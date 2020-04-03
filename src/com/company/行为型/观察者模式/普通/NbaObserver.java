package com.company.行为型.观察者模式.普通;

public class NbaObserver extends Observer {

    public NbaObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getSome()+ name+ " 关闭NBA");
    }
}
