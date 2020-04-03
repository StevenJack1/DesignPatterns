package com.company.结构型.组合模式;

/**
 * Componet 为组合中的对象声明接口，在适当情况下，实现所有类共有接口的默认行为。声明一个接口
 * 用于访问和管理Componet的子部件
 */
public abstract class Componet {
    protected String name;

    public Componet(String name) {
        this.name = name;
    }

    public abstract void create(Componet componet);
    public abstract void delete(Componet componet);
    public abstract void show(int depth);
}
