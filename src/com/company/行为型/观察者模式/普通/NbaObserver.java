package com.company.��Ϊ��.�۲���ģʽ.��ͨ;

public class NbaObserver extends Observer {

    public NbaObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getSome()+ name+ " �ر�NBA");
    }
}
