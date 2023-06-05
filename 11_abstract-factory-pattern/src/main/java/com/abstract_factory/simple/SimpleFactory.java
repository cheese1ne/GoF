package com.abstract_factory.simple;

import com.abstract_factory.simple.factory.ConcreteFactoryOne;
import com.abstract_factory.simple.factory.ConcreteFactoryTwo;
import com.abstract_factory.simple.factory.IFactory;
import com.abstract_factory.simple.product.IProductA;
import com.abstract_factory.simple.product.IProductB;

/**
 * 简单工厂
 * 内部使用抽象工厂构建产品
 *
 * @author sobann
 */
public class SimpleFactory {

    /**
     * 使用简单工厂构建抽象工厂
     *
     * @param type 类型
     * @return 工厂
     */
    private IFactory selectFactory(String type) {
        IFactory factory = null;
        switch (type) {
            case "1":
                factory = new ConcreteFactoryOne();
                break;
            case "2":
                factory = new ConcreteFactoryTwo();
                break;
            default:
                throw new RuntimeException("error type: " + type);
        }
        return factory;
    }

    /**
     * 生产产品A
     *
     * @param type 类型
     * @return 产品A
     */
    public IProductA createProductA(String type) {
        IFactory factory = this.selectFactory(type);
        return factory.createProductA();
    }

    /**
     * 生产产品B
     *
     * @param type 类型
     * @return 产品B
     */
    public IProductB createProductB(String type) {
        IFactory factory = this.selectFactory(type);
        return factory.createProductB();
    }

}
