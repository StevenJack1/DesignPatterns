package com.company.行为型.策略模式;

public class Main {

    public static void main(String[] args) {
        CashContent cashContent = null;
        String type = "返利";
        switch (type){
            case "正常收费":
                cashContent = new CashContent(new CashNormal());
                break;
            case "返利":
                cashContent = new CashContent(new CashReturn(300,100));
                break;
            case "打折":
                cashContent = new CashContent(new CashRebate(0.8));
                break;
        }
        double result = cashContent.getResult(300);
        System.out.println(result);
    }
}
