package com.company.行为型.观察者模式.普通;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();

        StockObserver yzf = new StockObserver("yzf", boss);
        NbaObserver hhh = new NbaObserver("hhh", boss);

        boss.attach(yzf);
        boss.attach(hhh);

        boss.detach(hhh);

        boss.setSome("老板回来了");

        boss.notifys();
    }
}
