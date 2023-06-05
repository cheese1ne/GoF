package com.factory_method.sale.factory;

import com.factory_method.sale.IFactory;
import com.factory_method.sale.ISale;
import com.factory_method.sale.strategy.CashNormal;
import com.factory_method.sale.strategy.CashRebate;
import com.factory_method.sale.strategy.CashReturn;

/**
 * 先满减再打折的销售模式创建工厂
 *
 * @author sobann
 */
public class CashReturnRebateFactory implements IFactory {

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

    public CashReturnRebateFactory(double moneyRebate, double moneyCondition, double moneyReturn) {
        this.moneyRebate = moneyRebate;
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public ISale createSalesModel() {
        CashNormal cn = new CashNormal();
        CashRebate crb = new CashRebate(this.moneyRebate);
        CashReturn crt = new CashReturn(this.moneyCondition, this.moneyReturn);

        // 先打折再满减
        crb.setDecorate(cn);
        crt.setDecorate(crb);
        return crt;
    }
}
