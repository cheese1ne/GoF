package com.composite_pattern.company;

/**
 * 公司抽象
 *
 * @author sobann
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    /**
     * 添加节点
     *
     * @param company
     */
    public abstract void add(Company company);

    /**
     * 移除节点
     *
     * @param company
     */
    public abstract void remove(Company company);

    /**
     * 一些通用的操作行为抽象在这里定义
     *
     * @param depth 树深
     */
    public abstract void display(int depth);

    /**
     * 履行职责
     * 不同的部门层级履行不同的职责
     */
    public abstract void lineDuty();
}
