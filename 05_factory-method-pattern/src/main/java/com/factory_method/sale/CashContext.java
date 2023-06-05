package com.factory_method.sale;


import com.factory_method.sale.factory.CashRebateReturnFactory;
import com.factory_method.sale.factory.CashReturnRebateFactory;

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
        // 销售模式工厂
        IFactory factory = null;
        switch (cashType) {
            case 1:
                // 基础价格计算 折扣为1.0, 满减条件为0 减值为 0
                factory = new CashRebateReturnFactory(1.0d, 0, 0);
                break;
            case 2:
                // 8折 就是折扣为0.8, 满减条件为0 减值为0
                factory = new CashRebateReturnFactory(0.8d, 0, 0);
                break;
            case 3:
                // 7折 同8折逻辑
                factory = new CashRebateReturnFactory(0.7d, 0, 0);
                break;
            case 4:
                // 满300 减100 折扣为1.0, 满减条件为300 减值为100
                factory = new CashRebateReturnFactory(1.0d, 300, 100);
                break;
            case 5:
                // 先打8折，再满300减100
                factory = new CashRebateReturnFactory(0.8d, 300, 100);
                break;
            case 6:
                // 先满300减100 再打8折
                factory = new CashReturnRebateFactory(0.8d, 300, 100);
                break;
            default:
                throw new RuntimeException("error cashType: " + cashType);
        }
        this.cs = factory.createSalesModel();
    }

    public double getResult(double price, int num) {
        // 根据收费策略的不同 获得计算结果
        return this.cs.acceptCash(price, num);
    }
}
