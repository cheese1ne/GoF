package com.composite_pattern.company;

/**
 * 财务部
 *
 * @author sobann
 */
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
    }

    @Override
    public void remove(Company company) {
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void lineDuty() {
        System.out.println(name + " 公司财务收支管理");
    }
}
