package com.mediator_pattern.unitednation.country;

import com.mediator_pattern.unitednation.Country;
import com.mediator_pattern.unitednation.UnitedNations;

/**
 * 美国
 *
 * @author sobann
 */
public class USA extends Country {
    public USA(UnitedNations unitedNations) {
        super(unitedNations);
    }

    public void declare(String message) {
        this.unitedNations.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("美国获得对方消息：" + message);
    }
}
