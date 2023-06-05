package com.factory_method.sale;

/**
 * 现金支付策略的抽象
 *
 * @author sobann
 */
public abstract class CashSuper implements ISale {
    /**
     * 装饰者
     */
    protected ISale component;

    public void setDecorate(ISale component) {
        this.component = component;
    }

    /**
     * 计算金额 默认实现
     *
     * @param price 单价
     * @param num   数量
     * @return 收取的费用
     */
    @Override
    public double acceptCash(double price, int num) {
        double result = 0d;
        if (null != this.component) {
            // 若装饰者存在 执行装饰者的方法
            result = this.component.acceptCash(price, num);
        }
        return result;
    }
}
