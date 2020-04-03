package com.company.��Ϊ��.������ģʽ.ԭ��;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ö������Ԫ�أ������ṩһ���߲�Ľӿ�����������߷�������Ԫ��
 */
public class ObjectStructure {
    private List<Element> list = new ArrayList<>();
    public void attach(Element element){
        list.add(element);
    }
    public void detach(Element element){
        list.remove(element);
    }
    public void accept(Visitor visitor){
        for (Element e: list){
            e.accept(visitor);
        }
    }
}
