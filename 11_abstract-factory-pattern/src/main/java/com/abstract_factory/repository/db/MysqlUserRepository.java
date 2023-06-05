package com.abstract_factory.repository.db;

import com.abstract_factory.repository.IUserRepository;
import com.abstract_factory.repository.bo.User;

/**
 * Mysql的用户
 *
 * @author sobann
 */
public class MysqlUserRepository implements IUserRepository {

    private static final String INFO = "通过Mysql驱动获取Mysql连接实例...\n已连到mysql...\n";

    @Override
    public void insert(User user) {
        System.out.println("----------------------------------Start------------------------------------");
        System.out.println(INFO + "执行插入: + mysql ------ insert into user values (*,*,*,*)");
        System.out.println("----------------------------------END------------------------------------");

    }

    @Override
    public User getById(Long id) {
        System.out.println("----------------------------------Start------------------------------------");
        System.out.println(INFO + "执行查询: + mysql ------ select * from user where id = " + id);
        System.out.println("----------------------------------END------------------------------------");
        return new User();
    }
}
