package com.company.��Ϊ��.������ģʽ.ʵ��;


public abstract class AbstractExpression {
    /**
     * ������
     * @param context
     */
    public void interpret(Context context){
        if (context.getText().length()==0){
            return;
        } else {
            String key = context.getText().substring(0, 1);
            double value = Double.parseDouble(context.getText().substring(2,3));
            if (context.getText().length() >= 4){
                context.setText(context.getText().substring(4));
            } else {
                context.setText(null);
            }
            excute(key,value);
        }
    }

    public abstract void excute(String key,double value);
}
