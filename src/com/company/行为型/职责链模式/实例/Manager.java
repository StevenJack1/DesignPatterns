package com.company.��Ϊ��.ְ����ģʽ.ʵ��;

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
