package com;

import com.iterator_pattern.simple.ConcreteAggregate;
import com.iterator_pattern.simple.Iterator;

/**
 * 迭代器模式
 *
 * 需要访问一个聚集的对象，不管这些对象是什么都需要遍历的时候，使用迭代器模式
 * 为遍历不同聚集结构提供如开始、下一个、是否结束、当前哪一项等统一的接口
 *
 * java.util.Iterator 就是典型的迭代器模式的应用
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) {
        simple();
    }

    /**
     * 迭代器模式一个简单的例子
     * 树形结构的处理
     */
    private static void simple() {
        ConcreteAggregate<String> bus = new ConcreteAggregate<>();
        bus.add("大鸟");
        bus.add("小菜");
        bus.add("行李");
        bus.add("老外");
        bus.add("公交内部员工");
        bus.add("小偷");

        Iterator<String> iterator = bus.createIterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item + "请购买车票!");
        }
    }
}
