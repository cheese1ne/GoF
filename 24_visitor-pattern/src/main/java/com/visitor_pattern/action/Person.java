package com.visitor_pattern.action;

/**
 * 人类抽象类
 *
 * @author sobann
 */
public abstract class Person {

    /**
     * 接受访问
     *
     * @param visitor
     */
    public abstract void accept(Action visitor);
}
