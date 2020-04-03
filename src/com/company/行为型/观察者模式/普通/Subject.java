package com.company.行为型.观察者模式.普通;

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifys();
    String getSome();
    void setSome(String action);
}
