package com.company.��Ϊ��.����ģʽ;

public class CashContent {

    private CashSuper cashSuper;

    public CashContent(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
