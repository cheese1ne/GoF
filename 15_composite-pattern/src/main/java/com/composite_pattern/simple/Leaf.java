package com.composite_pattern.simple;

/**
 * component的叶子节点
 *
 * @author sobann
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        // 叶子节点不能往下添加节点
        throw new RuntimeException("can not add to a leaf");
    }

    @Override
    public void remove(Component component) {
        throw new RuntimeException("can not remove from a leaf");
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}
