package com.company.²ßÂÔÄ£Ê½;

public class CashRebate implements CashSuper {
    private double moneyRebate;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
