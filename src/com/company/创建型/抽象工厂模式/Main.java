package com.company.抽象工厂模式;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        IUser user1 = DataAcess.createUser();
        user1.insert(user);
        user1.get(1);

        IDepartment department1 = DataAcess.createDepartment();
        department1.insert(department);
        department1.get(1);

    }
}
