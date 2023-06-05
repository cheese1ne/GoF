package com.flyweight_pattern.simple.flyweight;

import com.flyweight_pattern.simple.Flyweight;

/**
 * 需要具体共享的具体Flyweight子类
 *
 * @author sobann
 */
public class UnsharedConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体Flyweight：" + extrinsicstate);
    }
}
