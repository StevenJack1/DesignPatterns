package com.company.�ṹ��.������ģʽ;

public class QianFeng extends Player {

    public QianFeng(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(this.name+"ǰ�������");
    }

    @Override
    public void defense() {
        System.out.println(this.name+"ǰ����أ�");
    }
}
