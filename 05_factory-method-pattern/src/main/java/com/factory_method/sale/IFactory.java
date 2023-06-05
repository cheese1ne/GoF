package com.factory_method.sale;

/**
 * 创建销售模式的顶层工厂
 *
 * @author sobann
 */
public interface IFactory {

    /**
     * 创建销售模式
     *
     * @return 销售模式
     */
    ISale createSalesModel();
}
