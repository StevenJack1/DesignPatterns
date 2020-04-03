package com.company.结构型.组合模式;

/**
 * Leaf 在组合中表示叶节点对象，叶节点没有子节点
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
