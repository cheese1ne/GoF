package com.prototype_pattern.resume;

/**
 * 工作经验类
 * 复杂对象的clone必须让成员中每一个属性都实现Cloneable并重新clone方法
 *
 * @author sobann
 */
public class WorkExperience implements Cloneable{
    /**
     * 工作时间范围
     */
    private String timeArea;
    /**
     * 所在公司
     */
    private String company;

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public WorkExperience clone() throws CloneNotSupportedException {
        WorkExperience workExperience = null;
        try {
            workExperience = (WorkExperience)super.clone();
        }catch (CloneNotSupportedException e) {
            System.out.println("clone WorkExperience error");
        }
        return workExperience;
    }
}
