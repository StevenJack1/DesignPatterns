package com.company.��Ϊ��.������ģʽ.ԭ��;

import java.util.ArrayList;

/**
 * ������ʾ���ķ������������һ���ض��ľ��ӵĳ����﷨����
 * ���ý��Ͳ���
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        ArrayList<AbstractExpression> list  = new ArrayList<>();

        list.add(new TermianlExpression());
        list.add(new NontermianlExpression());
        list.add(new TermianlExpression());
        list.add(new TermianlExpression());

        for (AbstractExpression abstractExpression:list){
            abstractExpression.interpret(context);
        }
    }
}
