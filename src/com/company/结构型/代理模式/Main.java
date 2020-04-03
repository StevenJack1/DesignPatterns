package com.company.结构型.代理模式;

public class Main {

    public static void main(String[] args) {
        Girl girl = new Girl("娇娇");

        Proxy proxy = new Proxy(girl);

        proxy.giveChocolate();
        proxy.giveDoll();
        proxy.giveFlower();

    }
}
