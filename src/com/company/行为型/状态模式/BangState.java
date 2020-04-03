package com.company.行为型.状态模式;


public class BangState extends State {

    @Override
    public void writeProgram(Work w) {
        if (w.isFinish()){
            w.setState(new GoState());
            w.writeProgram();
        } else {
            if (w.getHour() < 21){
                System.out.println("当前时间："+ w.getHour());
            } else {
                w.setState(new SleepState());
                w.writeProgram();
            }
        }


    }
}
