package com.company.行为型.解释器模式.实例;


public abstract class AbstractExpression {
    /**
     * 解释器
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
