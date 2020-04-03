package com.company.创建型.抽象工厂模式;

public class AcessFactory implements IFactory{

    @Override
    public IUser createUser(){
        return new AcessUser();
    }

    @Override
    public IDepartment createDepartment(){
        return new AcessDepartment();
    }

}
