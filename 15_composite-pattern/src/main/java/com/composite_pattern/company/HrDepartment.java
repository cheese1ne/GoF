package com.composite_pattern.company;

/**
 * 人力资源部
 *
 * @author sobann
 */
public class HrDepartment extends Company {
    public HrDepartment(String name) {
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
        System.out.println(name + " 员工招聘培训管理");
    }
}
