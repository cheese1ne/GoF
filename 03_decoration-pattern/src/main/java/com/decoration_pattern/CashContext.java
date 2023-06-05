package com.decoration_pattern;

import com.decoration_pattern.strategy.CashNormal;
import com.decoration_pattern.strategy.CashRebate;
import com.decoration_pattern.strategy.CashReturn;

/**
 * 现金支付上下文
 *
 * @author sobann
 */
public class CashContext {

    private ISale cs;

    /**
     * 装饰模式 + 简单工厂
     *
     * @param cashType
     */
    public CashContext(int cashType) {
        switch (cashType) {
            case 1:
                this.cs = new CashNormal();
                break;
            case 2:
                // 8折
                this.cs = new CashRebate(0.8);
                break;
            case 3:
                // 7折
                this.cs = new CashRebate(0.7);
                break;
            case 4:
                // 满300 减100
                this.cs = new CashReturn(300, 100);
                break;
            case 5:
                // 先打8折，再满300减100
                CashNormal cn = new CashNormal();
                CashReturn crt = new CashReturn(300, 100);
                CashRebate cre = new CashRebate(0.8);
                crt.setDecorate(cn);
                cre.setDecorate(crt);
                this.cs = cre;
                break;
            case 6:
                // 先满300减100 再打8折
                CashNormal cn2 = new CashNormal();
                CashRebate cre2 = new CashRebate(0.8);
                CashReturn crt2 = new CashReturn(300, 100);
                cre2.setDecorate(cn2);
                crt2.setDecorate(cre2);
                this.cs = crt2;
                break;
            default:
                this.cs = null;
        }
    }

    public double getResult(double price, int num) {
        // 根据收费策略的不同 获得计算结果
        return this.cs.acceptCash(price, num);
    }
}
