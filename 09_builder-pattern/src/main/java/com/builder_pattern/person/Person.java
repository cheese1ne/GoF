package com.builder_pattern.person;

/**
 * 人
 *
 * @author sobann
 */
public class Person {
    /**
     * 头
     */
    private String head;
    /**
     * 身体
     */
    private String body;
    /**
     * 左手
     */
    private String armLeft;
    /**
     * 右手
     */
    private String armRight;
    /**
     * 左脚
     */
    private String legLeft;
    /**
     * 右脚
     */
    private String legRight;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getArmLeft() {
        return armLeft;
    }

    public void setArmLeft(String armLeft) {
        this.armLeft = armLeft;
    }

    public String getArmRight() {
        return armRight;
    }

    public void setArmRight(String armRight) {
        this.armRight = armRight;
    }

    public String getLegLeft() {
        return legLeft;
    }

    public void setLegLeft(String legLeft) {
        this.legLeft = legLeft;
    }

    public String getLegRight() {
        return legRight;
    }

    public void setLegRight(String legRight) {
        this.legRight = legRight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", armLeft='" + armLeft + '\'' +
                ", armRight='" + armRight + '\'' +
                ", legLeft='" + legLeft + '\'' +
                ", legRight='" + legRight + '\'' +
                '}';
    }
}
