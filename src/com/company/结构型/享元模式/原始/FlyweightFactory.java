package com.company.结构型.享元模式.原始;

import java.util.Hashtable;

// 享元工厂
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
