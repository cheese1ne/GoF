package com.iterator_pattern.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚集类
 *
 * @author sobann
 */
public class ConcreteAggregate<T> extends Aggregate<T> {

    private List<T> items = new ArrayList<>();

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(this);
    }

    /**
     * 聚集的总个数
     *
     * @return
     */
    public int getCount() {
        return items.size();
    }

    /**
     * 添加新对象
     *
     * @param item
     */
    public void add(T item) {
        this.items.add(item);
    }

    /**
     * 随机访问对象
     *
     * @param index
     * @return
     */
    public T getCurrentItem(int index) {
        return items.get(index);
    }

}
