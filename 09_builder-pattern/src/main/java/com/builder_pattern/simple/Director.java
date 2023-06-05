package com.builder_pattern.simple;

/**
 * 指挥者
 * 指挥建造者完成产品的建造，对调用者隐藏建造过程
 *
 * @author sobann
 */
public class Director {

    /**
     * 指挥建造
     *
     * @param builder
     */
    public void construct(Builder builder) {
        builder.buildPropertyA();
        builder.buildPropertyB();
        builder.buildPropertyC();
    }
}
