package com.company.行为型.状态模式;


public class SleepState extends State {
    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间："+ w.getHour());
    }
}
