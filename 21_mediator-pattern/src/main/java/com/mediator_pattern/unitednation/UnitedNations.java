package com.mediator_pattern.unitednation;

/**
 * 联合国结构
 * 中介者类
 *
 * @author sobann
 */
public abstract class UnitedNations {

    /**
     * 声明
     *
     * @param message
     * @param country
     */
    public abstract void declare(String message, Country country);
}
