package com.composite_pattern.simple;

/**
 * 组合对象的声明接口，在适当情况下 实现所有类共有接口的默认行为，声明一个接口用与访问访问Component的子组件
 *
 * @author sobann
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * 添加节点
     *
     * @param component
     */
    public abstract void add(Component component);

    /**
     * 移除节点
     *
     * @param component
     */
    public abstract void remove(Component component);

    /**
     * 一些通用的操作行为抽象在这里定义
     *
     * @param depth 树深
     */
    public abstract void display(int depth);
}
