package com.company.行为型.职责链模式.实例;

public class ZongJian extends Manager {

    public ZongJian(String name) {
        super(name);
    }
    @Override
    public void handlerRequest(Request request) {
        if (request.getType().equals("请假") && request.getNumber() < 5){
            System.out.println("总监可以处理5天的请假");
        } else{
            if (superior!=null){
                superior.handlerRequest(request);
            }
        }
    }
}
