package com.strategy_pattern.strategy;

import com.strategy_pattern.CashSuper;

/**
 * 正常收费
 *
 * @author sobann
 */
public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }
}
