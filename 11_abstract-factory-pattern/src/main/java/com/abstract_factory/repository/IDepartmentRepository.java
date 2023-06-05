package com.abstract_factory.repository;

import com.abstract_factory.repository.bo.Department;

/**
 * 部门抽象
 *
 * @author sobann
 */
public interface IDepartmentRepository {

    /**
     * 插入部门
     *
     * @param department 部门实例
     */
    void insert(Department department);

    /**
     * 获取部门
     *
     * @param id 主键
     * @return 部门实例
     */
    Department getById(Long id);
}
