package com.composite_pattern.company;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体分公司类、树枝节点
 *
 * @author sobann
 */
public class ConcreteCompany extends Company {

    /**
     * 用与存储子节点的集合 可以是叶子节点 也可以是分支节点
     */
    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        // 节点展示
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        // 子节点展示
        for (Company child : this.children) {
            child.display(depth + 2);
        }
    }

    @Override
    public void lineDuty() {
        for (Company child : children) {
            child.lineDuty();
        }
    }
}
