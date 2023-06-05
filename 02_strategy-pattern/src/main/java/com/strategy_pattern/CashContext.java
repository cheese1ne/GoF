package com.strategy_pattern;

import com.strategy_pattern.strategy.CashNormal;
import com.strategy_pattern.strategy.CashRebate;
import com.strategy_pattern.strategy.CashReturn;

/**
 * 现金支付上下文
 *
 * @author sobann
 */
public class CashContext {

    private CashSuper strategy;

    /**
     * 策略模式与简单工厂结合
     *
     * @param cashType
     */
    public CashContext(int cashType) {
        switch (cashType) {
            case 1:
                this.strategy = new CashNormal();
                break;
            case 2:
                // 8折
                this.strategy = new CashRebate(0.8);
                break;
            case 3:
                // 7折
                this.strategy = new CashRebate(0.7);
                break;
            case 4:
                // 满300 减100
                this.strategy = new CashReturn(300, 100);
                break;
            default:
                this.strategy = null;
        }
    }

    public double getResult(double price, int num) {
        // 根据收费策略的不同 获得计算结果
        return this.strategy.acceptCash(price, num);
    }
}
