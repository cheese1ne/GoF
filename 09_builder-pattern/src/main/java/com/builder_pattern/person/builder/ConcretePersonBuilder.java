package com.builder_pattern.person.builder;

import com.builder_pattern.person.PersonBuilder;

/**
 * 普通人类建造工厂
 *
 * @author sobann
 */
public class ConcretePersonBuilder extends PersonBuilder {

    @Override
    public void buildHead() {
        this.person.setHead("普通的头");
    }

    @Override
    public void buildBody() {
        this.person.setBody("普通的身体");
    }

    @Override
    public void buildArmLeft() {
        this.person.setArmLeft("普通的左手");
    }

    @Override
    public void buildArmRight() {
        this.person.setArmRight("普通的右手");
    }

    @Override
    public void buildLegLeft() {
        this.person.setLegLeft("普通的左脚");
    }

    @Override
    public void buildLegRight() {
        this.person.setLegRight("普通的右脚");
    }
}
