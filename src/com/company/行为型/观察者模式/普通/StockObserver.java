package com.company.��Ϊ��.�۲���ģʽ.��ͨ;

public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getSome()+ name+ " �رչ�Ʊ����");
    }
}
