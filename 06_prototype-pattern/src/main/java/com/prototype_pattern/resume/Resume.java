package com.prototype_pattern.resume;

/**
 * 简历原型
 *
 * @author sobann
 */
public class Resume implements Cloneable {
    /**
     * 名字
     */
    private String name;
    /**
     * 性别
     */
    private String sex;
    /**
     * 年龄
     */
    private String age;
    /**
     * 工作经历实例
     * 若要实现简历原型的深拷贝，WorkExperience也需要实现Cloneable接口
     */
    private final WorkExperience work;

    public Resume(String name) {
        this.name = name;
        this.work = new WorkExperience();
    }

    public void setPersonInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        this.work.setTimeArea(timeArea);
        this.work.setCompany(company);
    }

    public void display() {
        System.out.println(this.name + " " + this.sex + " " + this.age);
        System.out.println("工作经历: " + this.work.getTimeArea() + " " + this.work.getCompany());
    }

    @Override
    public Resume clone() throws CloneNotSupportedException {
        Resume resume = null;
        try {
            resume = (Resume)super.clone();
        }catch (CloneNotSupportedException e) {
            System.out.println("clone Resume error");
        }
        return resume;
    }
}
