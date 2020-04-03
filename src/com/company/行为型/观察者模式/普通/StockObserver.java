package com.company.行为型.观察者模式.普通;

public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getSome()+ name+ " 关闭股票行情");
    }
}
