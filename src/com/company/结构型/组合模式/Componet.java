package com.company.�ṹ��.���ģʽ;

/**
 * Componet Ϊ����еĶ��������ӿڣ����ʵ�����£�ʵ�������๲�нӿڵ�Ĭ����Ϊ������һ���ӿ�
 * ���ڷ��ʺ͹���Componet���Ӳ���
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
