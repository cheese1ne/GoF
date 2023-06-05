package com.factory_method.sale.factory;

import com.factory_method.sale.IFactory;
import com.factory_method.sale.ISale;
import com.factory_method.sale.strategy.CashNormal;
import com.factory_method.sale.strategy.CashRebate;
import com.factory_method.sale.strategy.CashReturn;

/**
 * 先打折再满减的销售模式创建工厂
 *
 * @author sobann
 */
public class CashRebateReturnFactory implements IFactory {

    /**
     * 折扣
     */
    private double moneyRebate;
    /**
     * 满减条件
     */
    private double moneyCondition;
    /**
     * 满减值
     */
    private double moneyReturn;

    public CashRebateReturnFactory(double moneyRebate, double moneyCondition, double moneyReturn) {
        this.moneyRebate = moneyRebate;
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public ISale createSalesModel() {
        CashNormal cn = new CashNormal();
        CashReturn crt = new CashReturn(this.moneyCondition, this.moneyReturn);
        CashRebate crb = new CashRebate(this.moneyRebate);

        // 先打折再满减
        crt.setDecorate(cn);
        crb.setDecorate(crt);
        return crb;
    }
}
