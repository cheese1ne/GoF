package com.abstract_factory.repository;

import com.abstract_factory.repository.bo.User;

/**
 * 用户抽象
 *
 * @author sobann
 */
public interface IUserRepository {
    /**
     * 插入用户
     *
     * @param user 用户实例
     */
    void insert(User user);

    /**
     * 获取用户
     *
     * @param id 主键
     * @return 用户实例
     */
    User getById(Long id);
}
