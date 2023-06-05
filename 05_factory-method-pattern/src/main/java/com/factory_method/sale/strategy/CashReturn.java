package com.factory_method.sale.strategy;

import com.factory_method.sale.CashSuper;

/**
 * 满减策略
 *
 * @author sobann
 */
public class CashReturn extends CashSuper {
    /**
     * 满减条件
     */
    private double moneyCondition;
    /**
     * 返利值
     */
    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double price, int num) {
        double result = price * num;
        if (moneyCondition > 0 && result >= moneyCondition) {
            result = result - Math.floor(result / moneyCondition) * moneyReturn;
        }
        // 若当前对象中包含装饰者，使用装饰者计算实际的价格
        return super.acceptCash(result, 1);
    }
}
