package com.simple_factory.impl;

import com.simple_factory.Operation;

/**
 * 减法
 *
 * @author sobann
 */
public class Sub extends Operation {

    @Override
    public double getResult(double numberA, double numberB) {
        return numberA - numberB;
    }
}
