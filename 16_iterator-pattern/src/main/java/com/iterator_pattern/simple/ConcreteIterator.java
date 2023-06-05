package com.iterator_pattern.simple;

/**
 * 具体迭代器类
 *
 * @author sobann
 */
public class ConcreteIterator<T> extends Iterator<T> {

    private ConcreteAggregate<T> aggregate;
    private int current;

    public ConcreteIterator(ConcreteAggregate<T> aggregate) {
        this.aggregate = aggregate;
        this.current = 0;
    }

    @Override
    public T first() {
        return aggregate.getCurrentItem(0);
    }

    @Override
    public T next() {
        T ret = null;
        if (current < aggregate.getCount()) {
            ret = aggregate.getCurrentItem(current);
        }
        current++;
        return ret;
    }

    @Override
    public boolean hasNext() {
        return current < aggregate.getCount();
    }

    @Override
    public T currentItem() {
        return aggregate.getCurrentItem(current);
    }
}
