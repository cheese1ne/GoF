package com.adapter_pattern.translation;

/**
 * 外籍中锋
 *
 * @author sobann
 */
public class ForeignCenter {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attackCn() {
        System.out.println("外籍中锋 " + this.name + " 进攻");
    }

    public void defenseCn() {
        System.out.println("外籍中锋 " + this.name + " 防守");
    }
}
