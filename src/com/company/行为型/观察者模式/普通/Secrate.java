package com.company.行为型.观察者模式.普通;

import java.util.ArrayList;
import java.util.List;

public class Secrate implements Subject {
    private List<Observer> observerList = new ArrayList<Observer>();
    private String action;

    @Override
    public String getSome() {
        return action;
    }
    @Override
    public void setSome(String action) {
        this.action = action;
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifys() {
        for (Observer temp: observerList){
            temp.update();
        }
    }
}
