package com.abstract_factory.repository.db;

import com.abstract_factory.repository.IDepartmentRepository;
import com.abstract_factory.repository.bo.Department;

/**
 * Mysql的部门
 *
 * @author sobann
 */
public class MysqlDepartmentRepository implements IDepartmentRepository {

    private static final String INFO = "通过Mysql驱动获取Mysql连接实例...\n已连到mysql...\n";

    @Override
    public void insert(Department department) {
        System.out.println("----------------------------------Start------------------------------------");
        System.out.println(INFO + "执行插入: + mysql ------ insert into department values (*,*,*,*)");
        System.out.println("----------------------------------END------------------------------------");
    }

    @Override
    public Department getById(Long id) {
        System.out.println("----------------------------------Start------------------------------------");
        System.out.println(INFO + "执行查询: + mysql ------ select * from department where id = " + id);
        System.out.println("----------------------------------END------------------------------------");
        return new Department();
    }
}
