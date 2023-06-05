package com.adapter_pattern.translation;

/**
 * 球员
 *
 * @author sobann
 */
public abstract class Player {

    protected final String name;

    public Player(String name) {
        this.name = name;
    }

    /**
     * 进攻
     */
    public abstract void attack();

    /**
     * 防守
     */
    public abstract void defense();
}
