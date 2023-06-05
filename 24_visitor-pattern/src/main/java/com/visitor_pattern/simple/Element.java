package com.visitor_pattern.simple;

/**
 * 定义一个accept操作，它以一个访问者为参数
 *
 * @author sobann
 */
public abstract class Element {

    /**
     * 接收
     *
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}
