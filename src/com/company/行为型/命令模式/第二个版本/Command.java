package com.company.��Ϊ��.����ģʽ.�ڶ����汾;

public abstract class Command {
    protected Barbecuer barbecuer;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    public abstract void executeComm();

}
