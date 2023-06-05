package com.abstract_factory.repository.db;

import com.abstract_factory.repository.IDepartmentRepository;
import com.abstract_factory.repository.bo.Department;

/**
 * Sqlserver的部门
 *
 * @author sobann
 */
public class SqlserverDepartmentRepository implements IDepartmentRepository {

    private static final String INFO = "通过Sqlserver驱动获取Sqlserver连接实例...\n已连到Sqlserver...\n";

    @Override
    public void insert(Department department) {
        System.out.println("----------------------------------Start------------------------------------");
        System.out.println(INFO + "执行插入: + sqlserver ------ insert into department values (*,*,*,*)");
        System.out.println("----------------------------------END------------------------------------");
    }

    @Override
    public Department getById(Long id) {
        System.out.println("----------------------------------Start------------------------------------");
        System.out.println(INFO + "执行查询: + sqlserver ------ select * from department where id = " + id);
        System.out.println("----------------------------------END------------------------------------");
        return new Department();
    }
}
