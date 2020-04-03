package com.company.行为型.职责链模式.实例;

public class JingLi extends Manager {

    public JingLi(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        if (request.getType() == "请假" && request.getNumber() < 2){
            System.out.println("经理可以处理两天的请假");
        } else{
            if (superior!=null){
                superior.handlerRequest(request);
            }
        }
    }
}
