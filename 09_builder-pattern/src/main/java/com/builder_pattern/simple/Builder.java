package com.builder_pattern.simple;

/**
 * 创建Product对象各个部件的抽象类/接口
 *
 * @author sobann
 */
public abstract class Builder {

    protected Product product;

    public Builder() {
        this.product = new Product();
    }

    public Builder(Product product) {
        this.product = product;
    }

    /**
     * 建造组件A
     */
    public abstract void buildPropertyA();

    /**
     * 建造组件B
     */
    public abstract void buildPropertyB();

    /**
     * 建造组件C
     */
    public abstract void buildPropertyC();

    /**
     * 获取建造的产品
     *
     * @return 建造的产品
     */
    public abstract Product getProduct();
}
