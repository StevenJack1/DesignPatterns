package com.company.��Ϊ��.�۲���ģʽ.��ͨ;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();

        StockObserver yzf = new StockObserver("yzf", boss);
        NbaObserver hhh = new NbaObserver("hhh", boss);

        boss.attach(yzf);
        boss.attach(hhh);

        boss.detach(hhh);

        boss.setSome("�ϰ������");

        boss.notifys();
    }
}
