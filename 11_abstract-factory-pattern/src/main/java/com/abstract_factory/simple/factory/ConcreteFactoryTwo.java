package com.abstract_factory.simple.factory;

import com.abstract_factory.simple.product.IProductA;
import com.abstract_factory.simple.product.IProductB;
import com.abstract_factory.simple.product.impl.ProductA2;
import com.abstract_factory.simple.product.impl.ProductB2;

/**
 * 具体的工厂1
 *
 * @author sobann
 */
public class ConcreteFactoryTwo implements IFactory{

    @Override
    public IProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public IProductB createProductB() {
        return new ProductB2();
    }
}
