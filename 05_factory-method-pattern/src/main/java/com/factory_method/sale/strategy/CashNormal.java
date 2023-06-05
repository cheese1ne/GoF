package com.factory_method.sale.strategy;

import com.factory_method.sale.ISale;

/**
 * 正常收费
 * CashNormal 提供最基本的功能实现 也就是单价*数量的原价算法
 *
 * @author sobann
 */
public class CashNormal implements ISale {

    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }
}
