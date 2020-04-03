package com.company.行为型.状态模式;


public class Main {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();
        work.setHour(12);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(17);
        work.writeProgram();

        work.setFinish(true);
        work.setHour(21);
        work.writeProgram();
    }
}
