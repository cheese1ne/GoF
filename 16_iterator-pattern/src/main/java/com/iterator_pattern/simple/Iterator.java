package com.iterator_pattern.simple;

/**
 * 迭代器抽象类
 *
 * @author sobann
 */
public abstract class Iterator<T> {

    /**
     * 第一个
     *
     * @return
     */
    public abstract T first();

    /**
     * 下一个
     *
     * @return
     */
    public abstract T next();

    /**
     * 是否到最后
     *
     * @return
     */
    public abstract boolean hasNext();

    /**
     * 当前对象
     *
     * @return
     */
    public abstract T currentItem();

}
