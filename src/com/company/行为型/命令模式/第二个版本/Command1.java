package com.company.��Ϊ��.����ģʽ.�ڶ����汾;

public class Command1 extends Command {

    public Command1(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeComm() {
        barbecuer.kaoYangRou();
    }
}
