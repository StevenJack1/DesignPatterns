package com.company.������.���󹤳�ģʽ;

public class AcessDepartment implements IDepartment {
    @Override
    public void insert(Department department){
        System.out.println("��Acess�в���һ������");
    }
    @Override
    public Department get(int id){
        System.out.println("��Acess�л�ȡ��Ϣ");
        return null;
    }

}
