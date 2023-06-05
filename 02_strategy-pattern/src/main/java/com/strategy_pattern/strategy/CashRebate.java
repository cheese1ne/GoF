package com.strategy_pattern.strategy;

import com.strategy_pattern.CashSuper;

/**
 * 打折收费
 *
 * @author sobann
 */
public class CashRebate extends CashSuper {

    /**
     * 折扣率
     */
    private final double moneyRebate;

    /**
     * 初始化时必须输入折扣率
     *
     * @param moneyRebate
     */
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double price, int num) {
        return price * num * this.moneyRebate;
    }
}
