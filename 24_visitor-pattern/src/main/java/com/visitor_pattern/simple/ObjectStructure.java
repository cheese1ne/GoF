package com.visitor_pattern.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 枚举元素，提供一个高层的接口以允许访问者访问它的元素
 *
 * @author sobann
 */
public class ObjectStructure {

    private final List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
