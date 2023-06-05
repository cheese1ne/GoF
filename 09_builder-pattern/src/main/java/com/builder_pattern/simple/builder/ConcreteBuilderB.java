package com.builder_pattern.simple.builder;

import com.builder_pattern.simple.Builder;
import com.builder_pattern.simple.Product;

/**
 * 创建Product对象各个部件的一个简单的实现建造者
 *
 * @author sobann
 */
public class ConcreteBuilderB extends Builder {

    @Override
    public void buildPropertyA() {
        this.product.setPropertyA("建造者B生产的组件A");
    }

    @Override
    public void buildPropertyB() {
        this.product.setPropertyB("建造者B生产的组件B");
    }

    @Override
    public void buildPropertyC() {
        this.product.setPropertyC("建造者B生产的组件C");
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
}
