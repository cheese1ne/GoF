package com.builder_pattern.person;

/**
 * 女娲(建造器的指挥者)
 *
 * @author sobann
 */
public class NuWa {

    private PersonBuilder builder;

    public NuWa(PersonBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(PersonBuilder builder) {
        this.builder = builder;
    }

    /**
     * 女娲造人!(捏小人太费劲了，流水线生产~)
     */
    public void createPerson() {
        builder.buildHead();
        builder.buildBody();
        builder.buildArmLeft();
        builder.buildArmRight();
        builder.buildLegLeft();
        builder.buildLegRight();
    }
}
