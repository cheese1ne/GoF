package com.brige_pattern.phone;

/**
 * 手机品牌
 *
 * @author sobann
 */
public abstract class HandsetBrand {

    protected HandsetSoft soft;

    public void setHandsetSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    /**
     * 运行
     */
    public abstract void run();

}
