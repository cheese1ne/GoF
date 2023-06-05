package com.factory_method.operation.impl;

import com.factory_method.operation.Operation;

/**
 * 对数运算类
 * 以numberA为底的numberB的对数
 *
 * @author sobann
 */
public class Log extends Operation {

    @Override
    public double getResult(double numberA, double numberB) {
        return Math.log(numberB) / Math.log(numberA);
    }
}
