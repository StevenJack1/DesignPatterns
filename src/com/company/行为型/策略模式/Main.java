package com.company.��Ϊ��.����ģʽ;

public class Main {

    public static void main(String[] args) {
        CashContent cashContent = null;
        String type = "����";
        switch (type){
            case "�����շ�":
                cashContent = new CashContent(new CashNormal());
                break;
            case "����":
                cashContent = new CashContent(new CashReturn(300,100));
                break;
            case "����":
                cashContent = new CashContent(new CashRebate(0.8));
                break;
        }
        double result = cashContent.getResult(300);
        System.out.println(result);
    }
}
