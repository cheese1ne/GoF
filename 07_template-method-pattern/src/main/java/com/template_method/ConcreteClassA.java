package com.template_method;

/**
 * 模板方法具体实现类A
 *
 * @author sobann
 */
public class ConcreteClassA extends AbstractClass{

    @Override
    protected void primitiveOperationOne() {
        System.out.println("ConcreteClassA  primitiveOperationOne work");
    }

    @Override
    protected void primitiveOperationTwo() {
        System.out.println("ConcreteClassA  primitiveOperationTwo work");
    }
}
