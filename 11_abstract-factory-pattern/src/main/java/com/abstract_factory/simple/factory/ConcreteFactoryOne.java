package com.abstract_factory.simple.factory;

import com.abstract_factory.simple.product.IProductA;
import com.abstract_factory.simple.product.IProductB;
import com.abstract_factory.simple.product.impl.ProductA1;
import com.abstract_factory.simple.product.impl.ProductB1;

/**
 * 具体的工厂1
 *
 * @author sobann
 */
public class ConcreteFactoryOne implements IFactory{

    @Override
    public IProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public IProductB createProductB() {
        return new ProductB1();
    }
}
