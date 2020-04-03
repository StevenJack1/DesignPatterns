package com.company.行为型.访问者模式.原例;

import java.util.ArrayList;
import java.util.List;

/**
 * 能枚举它的元素，可以提供一个高层的接口以允许访问者访问它的元素
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
