package com.adapter_pattern.simple;

/**
 * adaptee的适配器类
 *
 * @author sobann
 */
public class Adapter extends Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
