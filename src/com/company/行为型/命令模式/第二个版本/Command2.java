package com.company.��Ϊ��.����ģʽ.�ڶ����汾;

public class Command2 extends Command {
    public Command2(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeComm() {
        barbecuer.kaoJiChi();
    }
}
