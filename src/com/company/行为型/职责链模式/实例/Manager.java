package com.company.行为型.职责链模式.实例;

public abstract class Manager {

    protected Manager superior;
    protected String name;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void handlerRequest(Request request);
}
