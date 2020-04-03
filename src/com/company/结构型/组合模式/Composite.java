package com.company.�ṹ��.���ģʽ;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite ������֦�ڵ���Ϊ�������洢�Ӳ�������Componet�ӿ���ʵ�����Ӳ����йصĲ���
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
