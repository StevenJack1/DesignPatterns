package com.company.结构型.装饰模式;

/**
 * 具体的装饰对象，起到给Component添加职责的功能
 */
public class BigTrouser extends Finery {

    @Override
    public void show() {
        System.out.println("裤子");
        super.show();
    }
}
