package com.company.结构型.外观模式;

public class Fund {

    private Stock1 stock1;
    private Stock2 stock2;
    private Stock3 stock3;

    public Fund() {
        this.stock1 = new Stock1();
        this.stock2 = new Stock2();
        this.stock3 = new Stock3();
    }

    public void buyFund(){
        stock1.buy();
        stock2.buy();
        stock3.buy();
    }

    public void sellFund(){
        stock1.sell();
        stock2.sell();
        stock3.sell();
    }
}
