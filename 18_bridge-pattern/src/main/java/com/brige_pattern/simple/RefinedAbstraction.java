package com.brige_pattern.simple;

/**
 * 具体的Abstraction
 *
 * @author sobann
 */
public class RefinedAbstraction extends Abstraction{

    @Override
    public void operation() {
        System.out.println("具体的Abstraction");
        this.implementor.operation();
    }
}
