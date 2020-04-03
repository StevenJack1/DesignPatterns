package com.company.创建型.抽象工厂模式;

public class SqlserverDepartment implements IDepartment{

    @Override
    public void insert(Department department){
        System.out.println("向SQl server中插入一条数据");
    }
    @Override
    public Department get(int id){
        System.out.println("在SQl server中获取信息");
        return null;
    }
}
