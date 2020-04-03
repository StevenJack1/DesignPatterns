package com.company.行为型.职责链模式.实例;

public class Main {

    public static void main(String[] args) {
        JingLi jingli = new JingLi("jingli");
        ZongJian zongjian = new ZongJian("zongjian");
        ZongJingLi zongjingli = new ZongJingLi("zongjingli");
        jingli.setSuperior(zongjian);
        zongjian.setSuperior(zongjingli);

        Request request1 = new Request("请假", 4);
        jingli.handlerRequest(request1);

        Request request2 = new Request("请假", 10);
        jingli.handlerRequest(request2);

        Request request3 = new Request("加薪", 100);
        jingli.handlerRequest(request3);

    }
}
