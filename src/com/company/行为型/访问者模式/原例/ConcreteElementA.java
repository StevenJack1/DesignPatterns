package com.company.��Ϊ��.������ģʽ.ԭ��;

/**
 * ʵ��accept����
 * ����˫���ɼ�����ʵ�ִ��������ݽṹ�ķ���
 */
public class ConcreteElementA extends Element {
    private String name;

    public ConcreteElementA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
