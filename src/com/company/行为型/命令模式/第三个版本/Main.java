package com.company.行为型.命令模式.第三个版本;

public class Main {

    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        Command1 command1 = new Command1(barbecuer);
        Command2 command2 = new Command2(barbecuer);
        Command1 command11 = new Command1(barbecuer);

        Waiter waiter = new Waiter();
        waiter.setOrder(command1);
        waiter.setOrder(command2);
        waiter.setOrder(command11);

        waiter.cancelOrder(command11);

        waiter.notify1();
    }
}
