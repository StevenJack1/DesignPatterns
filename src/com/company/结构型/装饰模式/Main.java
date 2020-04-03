package com.company.结构型.装饰模式;

public class Main {

    public static void main(String[] args) {
        Person xc = new Person("小菜");
        BigTrouser bigTrouser = new BigTrouser();
        Tshirts tshirts = new Tshirts();

        bigTrouser.decorate(xc);
        tshirts.decorate(bigTrouser);
        tshirts.show();


    }
}
