package com.company.�ṹ��.���ģʽ;

/**
 * Leaf ������б�ʾҶ�ڵ����Ҷ�ڵ�û���ӽڵ�
 */
public class Leaf extends Componet {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void create(Componet componet) {

    }

    @Override
    public void delete(Componet componet) {

    }

    @Override
    public void show(int depth) {
        System.out.println(depth+" "+ name);
    }

}
