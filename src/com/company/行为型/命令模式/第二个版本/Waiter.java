package com.company.��Ϊ��.����ģʽ.�ڶ����汾;

public class Waiter {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void notify1(){
        command.executeComm();
    }
}
