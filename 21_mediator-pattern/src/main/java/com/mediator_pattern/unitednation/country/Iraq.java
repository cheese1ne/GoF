package com.mediator_pattern.unitednation.country;

import com.mediator_pattern.unitednation.Country;
import com.mediator_pattern.unitednation.UnitedNations;

/**
 * 伊拉克
 *
 * @author sobann
 */
public class Iraq extends Country {
    public Iraq(UnitedNations unitedNations) {
        super(unitedNations);
    }

    public void declare(String message) {
        this.unitedNations.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("伊拉克获得对方消息：" + message);
    }
}
