package com.company.创建型.抽象工厂模式;


public class DataAcess {

    private static String AssemblyName = "抽象工厂模式";
    private static String db = "Sqlserver";
//    private static String db = "Acess";


    // 使用简单工厂模式来修改抽象工厂模式
//    public static IUser createUser(){
//        IUser result = null;
//        switch (db){
//            case "Sqlserver":
//                result = new SqlserverUser();
//                break;
//            case "Acess":
//                result = new AcessUser();
//                break;
//        }
//        return result;
//    }
//
//    public static IDepartment createDepartment(){
//        IDepartment result = null;
//        switch (db){
//            case "Sqlserver":
//                result = new SqlserverDepartment();
//                break;
//            case "Acess":
//                result = new AcessDepartment();
//                break;
//        }
//        return result;
//    }

    // 使用反射来修改抽象工厂模式
    public static IUser createUser() {
        String className = "com.company.创建型.抽象工厂模式." + db + "User";
        IUser iUser = null;
        try {
            iUser = (IUser) Class.forName(className).newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }
        return iUser;
    }

    public static IDepartment createDepartment() {
        String className = "com.company.创建型.抽象工厂模式." + db + "Department";
        IDepartment iDepartment = null;
        try {
            iDepartment = (IDepartment) Class.forName(className).newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }
        return iDepartment;
    }

}
