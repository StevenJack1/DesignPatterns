package com.company.������.���󹤳�ģʽ;


public class DataAcess {

    private static String AssemblyName = "���󹤳�ģʽ";
    private static String db = "Sqlserver";
//    private static String db = "Acess";


    // ʹ�ü򵥹���ģʽ���޸ĳ��󹤳�ģʽ
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

    // ʹ�÷������޸ĳ��󹤳�ģʽ
    public static IUser createUser() {
        String className = "com.company.������.���󹤳�ģʽ." + db + "User";
        IUser iUser = null;
        try {
            iUser = (IUser) Class.forName(className).newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }
        return iUser;
    }

    public static IDepartment createDepartment() {
        String className = "com.company.������.���󹤳�ģʽ." + db + "Department";
        IDepartment iDepartment = null;
        try {
            iDepartment = (IDepartment) Class.forName(className).newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }
        return iDepartment;
    }

}
