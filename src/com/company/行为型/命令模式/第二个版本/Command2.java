package com.company.行为型.命令模式.第二个版本;

public class Command2 extends Command {
    public Command2(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeComm() {
        barbecuer.kaoJiChi();
    }
}
