package com.company.��Ϊ��.������ģʽ.ʵ��;

/**
 * ������
 */
public class Scale extends AbstractExpression {
    @Override
    public void excute(String key, double value) {
        String scale = "";

        switch ((int)value){
            case 1:
                scale = "����";
                break;
            case 2:
                scale = "����";
                break;
            case 3:
                scale = "����";
                break;
            default:
                break;
        }
        System.out.println(scale);
    }
}
