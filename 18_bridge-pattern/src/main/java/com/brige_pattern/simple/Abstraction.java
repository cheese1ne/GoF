package com.brige_pattern.simple;

/**
 * 抽象
 *
 * @author sobann
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    /**
     * 操作
     */
    public abstract void operation();
}
