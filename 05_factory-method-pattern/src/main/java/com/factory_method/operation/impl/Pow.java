package com.factory_method.operation.impl;

import com.factory_method.operation.Operation;

/**
 * 指数运算类
 * numberA的numberB次幂
 *
 * @author sobann
 */
public class Pow extends Operation {

    @Override
    public double getResult(double numberA, double numberB) {
        return Math.pow(numberA, numberB);
    }
}
