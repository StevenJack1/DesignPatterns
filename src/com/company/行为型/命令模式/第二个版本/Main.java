package com.company.��Ϊ��.����ģʽ.�ڶ����汾;

public class Main {

    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        Command1 command1 = new Command1(barbecuer);
        Command2 command2 = new Command2(barbecuer);

        Waiter waiter = new Waiter();
        waiter.setCommand(command1);
        waiter.notify1();
        waiter.setCommand(command2);
        waiter.notify1();
    }
}
