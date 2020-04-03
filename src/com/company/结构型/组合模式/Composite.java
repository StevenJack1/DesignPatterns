package com.company.结构型.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite 定义有枝节点行为，用来存储子部件，在Componet接口中实现与子部件有关的操作
 */
public class Composite extends Componet {
    private List<Componet> componetList = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void create(Componet componet) {
        componetList.add(componet);
    }

    @Override
    public void delete(Componet componet) {
        componetList.remove(componet);
    }

    @Override
    public void show(int depth) {
        System.out.println(depth+" "+name);
        for (Componet componet:componetList){
            componet.show(depth+2);
        }
    }
}
