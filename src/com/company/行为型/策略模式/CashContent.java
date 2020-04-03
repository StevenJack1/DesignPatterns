package com.company.行为型.策略模式;

public class CashContent {

    private CashSuper cashSuper;

    public CashContent(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
