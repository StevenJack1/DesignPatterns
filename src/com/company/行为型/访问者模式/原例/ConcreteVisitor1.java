package com.company.��Ϊ��.������ģʽ.ԭ��;

/**
 * ��������ߣ�ʵ��ÿ����Visitor�����Ĳ�����ÿ������ʵ���㷨��һ���֣�
 * �����㷨Ƭ�����Ƕ�Ӧ�ڽṹ�ж������
 */
public class ConcreteVisitor1 extends Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getName()+"����A");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getName()+"����B");
    }
}
