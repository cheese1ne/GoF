package com.template_method;

/**
 * 模板方法具体实现类A
 *
 * @author sobann
 */
public class ConcreteClassB extends AbstractClass{

    @Override
    protected void primitiveOperationOne() {
        System.out.println("ConcreteClassB  primitiveOperationOne work");
    }

    @Override
    protected void primitiveOperationTwo() {
        System.out.println("ConcreteClassB  primitiveOperationTwo work");
    }
}
