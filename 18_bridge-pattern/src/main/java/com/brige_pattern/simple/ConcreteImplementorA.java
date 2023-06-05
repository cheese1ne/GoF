package com.brige_pattern.simple;

/**
 * 具体类A
 *
 * @author sobann
 */
public class ConcreteImplementorA extends Implementor{

    @Override
    public void operation() {
        System.out.println("具体实现A的方法执行");
    }
}
