package com.company.行为型.命令模式.第二个版本;

public abstract class Command {
    protected Barbecuer barbecuer;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    public abstract void executeComm();

}
