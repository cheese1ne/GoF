package com.builder_pattern.person;

/**
 * 女娲的人类建造工厂，一个个小人捏太费劲了～
 *
 * @author sobann
 */
public abstract class PersonBuilder {

    protected Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    public PersonBuilder(Person person) {
        this.person = person;
    }

    /**
     * 建造头
     */
    public abstract void buildHead();

    /**
     * 建造身体
     */
    public abstract void buildBody();

    /**
     * 建造左手
     */
    public abstract void buildArmLeft();

    /**
     * 建造右手
     */
    public abstract void buildArmRight();

    /**
     * 建造左脚
     */
    public abstract void buildLegLeft();

    /**
     * 建造右脚
     */
    public abstract void buildLegRight();

    /**
     * 获取小人实例
     *
     * @return 小人
     */
    public Person getPerson() {
        return this.person;
    }
}
