package com.company.行为型.命令模式.第二个版本;

public class Waiter {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void notify1(){
        command.executeComm();
    }
}
