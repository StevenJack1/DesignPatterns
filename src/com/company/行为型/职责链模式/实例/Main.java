package com.company.��Ϊ��.ְ����ģʽ.ʵ��;

public class Main {

    public static void main(String[] args) {
        JingLi jingli = new JingLi("jingli");
        ZongJian zongjian = new ZongJian("zongjian");
        ZongJingLi zongjingli = new ZongJingLi("zongjingli");
        jingli.setSuperior(zongjian);
        zongjian.setSuperior(zongjingli);

        Request request1 = new Request("���", 4);
        jingli.handlerRequest(request1);

        Request request2 = new Request("���", 10);
        jingli.handlerRequest(request2);

        Request request3 = new Request("��н", 100);
        jingli.handlerRequest(request3);

    }
}
