package com.company.������.������ģʽ_������ģʽ;

import java.util.ArrayList;
import java.util.List;

public class Product {

    List<String> parts = new ArrayList<>();

    public void Add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println(parts);
    }

}
