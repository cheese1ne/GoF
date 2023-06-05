package com.mediator_pattern.unitednation;

/**
 * 国家类，
 *
 * @author sobann
 */
public abstract class Country {

    protected UnitedNations unitedNations;

    public Country(UnitedNations unitedNations) {
        this.unitedNations = unitedNations;
    }
}
