package com.adapter_pattern.translation;

/**
 * 外籍中锋的翻译(外籍中锋的适配器)
 *
 * @author sobann
 */
public class Traslator extends Player {

    private ForeignCenter foreignCenter = new ForeignCenter();

    public Traslator(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    @Override
    public void attack() {
        foreignCenter.attackCn();
    }

    @Override
    public void defense() {
        foreignCenter.defenseCn();
    }
}
