package com.flyweight_pattern.simple;

/**
 * 具体享元的超类或者接口 通过这个接口，Flyweight可以接受并作用于外部状态
 *
 * @author sobann
 */
public abstract class Flyweight {

    /**
     * 操作
     *
     * @param extrinsicstate
     */
    public abstract void operation(int extrinsicstate);
}
