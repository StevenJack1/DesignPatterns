package com.company.行为型.状态模式;

public class XiaState extends State {

    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 17){
            System.out.println("当前时间："+ w.getHour());
        } else {
            w.setState(new BangState());
            w.writeProgram();
        }
    }
}
