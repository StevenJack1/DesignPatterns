package com.company.行为型.解释器模式.实例;

/**
 * 音符类
 */
public class Scale extends AbstractExpression {
    @Override
    public void excute(String key, double value) {
        String scale = "";

        switch ((int)value){
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
            default:
                break;
        }
        System.out.println(scale);
    }
}
