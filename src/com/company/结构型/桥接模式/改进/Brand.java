package com.company.结构型.桥接模式.改进;

/**
 * 手机品牌类
 */
public abstract class Brand {
    protected Soft soft;

    /**
     * 设置手机软件，品牌需要关注软件
     * @param soft
     */
    public void setSoft(Soft soft) {
        this.soft = soft;
    }

    public abstract void run();
}
