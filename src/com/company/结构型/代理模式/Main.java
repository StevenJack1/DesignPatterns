package com.company.�ṹ��.����ģʽ;

public class Main {

    public static void main(String[] args) {
        Girl girl = new Girl("����");

        Proxy proxy = new Proxy(girl);

        proxy.giveChocolate();
        proxy.giveDoll();
        proxy.giveFlower();

    }
}
