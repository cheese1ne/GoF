package com;

import com.abstract_factory.repository.IDepartmentRepository;
import com.abstract_factory.repository.IUserRepository;
import com.abstract_factory.repository.bo.Department;
import com.abstract_factory.repository.bo.User;
import com.abstract_factory.repository.factory.DataAccess;
import com.abstract_factory.simple.SimpleFactory;
import com.abstract_factory.simple.product.IProductA;
import com.abstract_factory.simple.product.IProductB;

/**
 * 抽象工厂模式
 *
 * @author sobann
 */
public class App {
    public static void main(String[] args) {
        // 简单的抽象工厂demo
        simple();
        // 现实中的栗子: DDD中具体的持久层以(仓储模式)翻转控制 抽象仓储层 完成数据的持久化
        repository();
    }

    /**
     * 简单工厂 + 抽象工厂
     * 简单工厂隐藏抽象工厂细节
     */
    public static void simple() {
        SimpleFactory simpleFactory = new SimpleFactory();
        IProductA productA = simpleFactory.createProductA("1");
        IProductB productB = simpleFactory.createProductB("1");
        System.out.println("productA = " + productA);
        System.out.println("productB = " + productB);

        //
        productA = simpleFactory.createProductA("2");
        productB = simpleFactory.createProductB("2");
        System.out.println("productA = " + productA);
        System.out.println("productB = " + productB);
    }


    /**
     * 现实中的栗子: DDD中具体的持久层以(仓储模式)翻转控制 抽象仓储层 完成数据的持久化
     * DataAccess使用两种方式:
     *  1.反射 + 抽象工厂
     *  2.简单工厂 + 抽象工厂
     */
    public static void repository() {
        // sqlserver仓储层
        DataAccess.setDb("Sqlserver");
        IDepartmentRepository departmentRepository = DataAccess.getDepartmentRepository();
        departmentRepository.insert(new Department());
        Department department = departmentRepository.getById(10086L);

        IUserRepository userRepository = DataAccess.getUserRepository();
        userRepository.insert(new User());
        User user = userRepository.getById(50L);

        System.out.println("=====================切换到mysql数据库=========================");
        // 切换仓储层为mysql
        DataAccess.setDb("Mysql");
        departmentRepository = DataAccess.getDepartmentRepository();
        departmentRepository.insert(new Department());
        department = departmentRepository.getById(10086L);

        userRepository = DataAccess.getUserRepository();
        userRepository.insert(new User());
        user = userRepository.getById(50L);



    }


}
