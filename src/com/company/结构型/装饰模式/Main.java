package com.company.�ṹ��.װ��ģʽ;

public class Main {

    public static void main(String[] args) {
        Person xc = new Person("С��");
        BigTrouser bigTrouser = new BigTrouser();
        Tshirts tshirts = new Tshirts();

        bigTrouser.decorate(xc);
        tshirts.decorate(bigTrouser);
        tshirts.show();


    }
}
