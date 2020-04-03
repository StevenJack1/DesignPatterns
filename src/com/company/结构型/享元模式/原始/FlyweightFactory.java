package com.company.�ṹ��.��Ԫģʽ.ԭʼ;

import java.util.Hashtable;

// ��Ԫ����
public class FlyweightFactory {

    private Hashtable flyweight = new Hashtable();

    public Flyweight getFlyWeight(String key){
        if (!flyweight.containsKey(key)){
            flyweight.put(key,new ConcreteFlyweight(key));
        }
        return (ConcreteFlyweight)flyweight.get(key);
    }

    public int getCount(){
        return flyweight.size();
    }

}
