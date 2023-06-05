package com.iterator_pattern.simple;

/**
 * 聚集抽象类
 *
 * @author sobann
 */
public abstract class Aggregate<T> {

    /**
     * 创建迭代器
     *
     * @return
     */
    public abstract Iterator<T> createIterator();
}
