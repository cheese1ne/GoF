package com;

import com.composite_pattern.company.Company;
import com.composite_pattern.company.ConcreteCompany;
import com.composite_pattern.company.FinanceDepartment;
import com.composite_pattern.company.HrDepartment;
import com.composite_pattern.simple.Composite;
import com.composite_pattern.simple.Leaf;

/**
 * 组合模式
 * 将对象组合成树形结构以表示 '部分-整体'的层次结构，组合模式使得用户对单个对象和组合对象的使用具有一致性
 *
 * 需求中出现部分-整体层次的结构，且可以忽略组合对象与单个对象的不同，统一地使用组合结构中的所有对象时，使用组合模式
 * java.awt.Component 就是典型的组合模式的应用
 *
 * @author sobann
 */
public class App {

    public static void main(String[] args) {
//        simple();
        company();
    }

    /**
     * 组合模式一个简单的例子
     * 树形结构的处理
     */
    private static void simple() {
        // 根节点
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite subComposite = new Composite("sub-composite");
        subComposite.add(new Leaf("Leaf SUB1-A"));
        subComposite.add(new Leaf("Leaf SUB1-B"));
        root.add(subComposite);

        Composite thirdComposite = new Composite("thd-composite2");
        thirdComposite.add(new Leaf("Leaf THD-A"));
        thirdComposite.add(new Leaf("Leaf THD-B"));
        subComposite.add(thirdComposite);

        root.add(new Leaf("Leaf C"));


        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);

    }

    /**
     * 公司的组织结构层级
     * 根节点：北京总公司
     * 树深1层：北京总公司人力资源部 北京总公司财务部 上海华东分公司
     * 树深2层：上海华东分公司人力资源部、上海华东分公司财务部、南京办事处、杭州办事处
     * 树深3层：南京办事处人力资源部、南京办事处财务部、杭州办事处人力资源部、杭州办事处财务部
     *
     *
     *
     *                              北京总公司
     *         人力资源部门       财务部门                        上海华东分公司
     *                                            人力资源部     财务部         南京办事处       杭州办事处
     *                                                                   人力资源部  财务部  人力资源部  财务部
     */
    private static void company() {
        Company root  =  new ConcreteCompany("北京总公司");
        root.add(new HrDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        Company comp  =  new ConcreteCompany("上海华东分公司");
        comp.add(new HrDepartment("上海华东分公司人力资源部"));
        comp.add(new FinanceDepartment("上海华东分公司财务部"));
        root.add(comp);

        Company subComp1 =  new ConcreteCompany("南京办事处");
        subComp1.add(new HrDepartment("南京办事处人力资源部"));
        subComp1.add(new FinanceDepartment("南京办事处财务部"));
        comp.add(subComp1);

        Company subComp2 =  new ConcreteCompany("杭州办事处");
        subComp2.add(new HrDepartment("杭州办事处人力资源部"));
        subComp2.add(new FinanceDepartment("杭州办事处财务部"));
        comp.add(subComp2);

        System.out.println("组织架构图: ");
        root.display(1);
        System.out.println("职责: ");
        root.lineDuty();
    }
}
