package com.composite_pattern.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 分支节点，用与储存子部件，实现与子部件有关的动作，如add和remove
 *
 * @author sobann
 */
public class Composite extends Component{

    /**
     * 用与存储子节点的集合 可以是叶子节点 也可以是分支节点
     */
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        // 节点展示
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        // 子节点展示
        for (Component child : this.children) {
            child.display(depth + 2);
        }
    }
}
