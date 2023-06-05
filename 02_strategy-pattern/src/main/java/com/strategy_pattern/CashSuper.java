package com.strategy_pattern;

/**
 * 现金支付策略的抽象
 *
 * @author sobann
 */
public abstract class CashSuper {

    /**
     * 计算金额
     *
     * @param price 单价
     * @param num   数量
     * @return 收取的费用
     */
    public abstract double acceptCash(double price, int num);
}
