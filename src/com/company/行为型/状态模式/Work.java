package com.company.行为型.状态模式;

public class Work {

    private double hour;
    private boolean finish = false;
    private State state;

    public Work() {
        this.state = new ShangState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void writeProgram(){
        state.writeProgram(this);
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
