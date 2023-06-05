package com.abstract_factory.simple.factory;

import com.abstract_factory.simple.product.IProductA;
import com.abstract_factory.simple.product.IProductB;

/**
 * 抽象工厂类
 * 可以建造产品A和产品B两种类型的产品(但不明确知道具体产品的型号参数)
 *
 * @author sobann
 */
public interface IFactory {

    /**
     * 生产A类型的产品
     *
     * @return A类型的产品
     */
    IProductA createProductA();

    /**
     * 生产B类型的产品
     *
     * @return B类型的产品
     */
    IProductB createProductB();
}
