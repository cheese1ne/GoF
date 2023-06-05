package com;

import com.template_method.AbstractClass;
import com.template_method.ConcreteClassA;
import com.template_method.ConcreteClassB;

/**
 * 模板方法模式
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) {
        AbstractClass concreteA = new ConcreteClassA();
        concreteA.templateMethod();

        AbstractClass concreteB = new ConcreteClassB();
        concreteB.templateMethod();
    }
}
