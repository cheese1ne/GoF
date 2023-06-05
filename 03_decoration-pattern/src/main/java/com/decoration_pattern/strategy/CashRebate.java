package com.decoration_pattern.strategy;

import com.decoration_pattern.CashSuper;

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
        // 计算折扣率后
        double result = price * num * this.moneyRebate;
        // 若当前对象中包含装饰者，使用装饰者计算实际的价格
        return super.acceptCash(result, 1);
    }
}
