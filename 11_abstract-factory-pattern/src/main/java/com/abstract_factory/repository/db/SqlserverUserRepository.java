package com.abstract_factory.repository.db;

import com.abstract_factory.repository.IUserRepository;
import com.abstract_factory.repository.bo.User;

/**
 * Sqlserver的用户
 *
 * @author sobann
 */
public class SqlserverUserRepository implements IUserRepository {

    private static final String INFO = "通过Sqlserver驱动获取Sqlserver连接实例...\n已连到Sqlserver...\n";

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
