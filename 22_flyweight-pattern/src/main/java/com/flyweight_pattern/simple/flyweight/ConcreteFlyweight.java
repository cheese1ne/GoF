package com.flyweight_pattern.simple.flyweight;

import com.flyweight_pattern.simple.Flyweight;

/**
 * 需要具体共享的具体Flyweight子类
 *
 * @author sobann
 */
public class ConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体Flyweight：" + extrinsicstate);
    }
}
