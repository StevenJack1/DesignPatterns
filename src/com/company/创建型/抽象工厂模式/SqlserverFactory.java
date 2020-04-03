package com.company.创建型.抽象工厂模式;

public class SqlserverFactory implements IFactory {

    @Override
    public IUser createUser(){
        return new SqlserverUser();
    }
    @Override
    public IDepartment createDepartment(){
        return new SqlserverDepartment();
    }
}
