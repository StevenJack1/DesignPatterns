package com.company.行为型.命令模式.第三个版本;

public class Command1 extends Command {

    public Command1(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeComm() {
        barbecuer.kaoYangRou();
    }
}
