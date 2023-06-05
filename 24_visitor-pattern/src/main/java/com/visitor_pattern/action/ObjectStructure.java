package com.visitor_pattern.action;

import java.util.ArrayList;
import java.util.List;

/**
 * 枚举元素，提供一个高层的接口以允许访问者访问它的元素
 *
 * @author sobann
 */
public class ObjectStructure {

    private final List<Person> elements = new ArrayList<>();

    public void attach(Person person) {
        elements.add(person);
    }

    public void detach(Person person) {
        elements.remove(person);
    }

    public void display(Action visitor) {
        for (Person element : elements) {
            element.accept(visitor);
        }
    }
}
