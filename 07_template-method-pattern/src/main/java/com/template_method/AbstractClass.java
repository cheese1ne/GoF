package com.template_method;

/**
 * 模板方法抽象类
 *
 * @author sobann
 */
public abstract class AbstractClass {

    public void templateMethod() {
        // 写一些可以被子类共享的代码...
        System.out.println("AbstractClass share method run ...");
        this.primitiveOperationOne();
        this.primitiveOperationTwo();
    }

    /**
     * 子类个性行为
     */
    protected abstract void primitiveOperationOne();
    /**
     * 子类个性行为
     */
    protected abstract void primitiveOperationTwo();
}
