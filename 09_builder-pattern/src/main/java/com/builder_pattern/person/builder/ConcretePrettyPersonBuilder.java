package com.builder_pattern.person.builder;

import com.builder_pattern.person.PersonBuilder;

/**
 * 漂亮的人类建造器
 * 
 * @author sobann
 */
public class ConcretePrettyPersonBuilder extends PersonBuilder {
    
    @Override
    public void buildHead() {
        this.person.setHead("漂亮的脑瓜子");
    }

    @Override
    public void buildBody() {
        this.person.setBody("漂亮的身体");
    }

    @Override
    public void buildArmLeft() {
        this.person.setArmLeft("漂亮的左手");
    }

    @Override
    public void buildArmRight() {
        this.person.setArmRight("漂亮的右手");
    }

    @Override
    public void buildLegLeft() {
        this.person.setLegLeft("漂亮的左脚");
    }

    @Override
    public void buildLegRight() {
        this.person.setLegRight("漂亮的右脚");
    }
}
