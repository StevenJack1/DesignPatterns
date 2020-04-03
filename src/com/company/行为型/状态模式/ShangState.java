package com.company.行为型.状态模式;


public class ShangState extends State {

    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 12){
            System.out.println("当前时间："+ w.getHour());
        } else {
            w.setState(new ZhongState());
            w.writeProgram();
        }
    }
}
