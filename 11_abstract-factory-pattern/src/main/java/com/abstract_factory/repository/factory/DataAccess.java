package com.abstract_factory.repository.factory;

import com.abstract_factory.repository.IDepartmentRepository;
import com.abstract_factory.repository.IUserRepository;
import com.abstract_factory.repository.db.MysqlUserRepository;
import com.abstract_factory.repository.db.SqlserverUserRepository;

import java.lang.reflect.InvocationTargetException;

/**
 * 抽象工厂
 *
 * @author sobann
 */
public class DataAccess {
    /**
     * 工程内工厂的路径信息
     */
    private static String PACKAGE_REFERENCE = "com.abstract_factory.repository.db.";
    /**
     * todo 项目启动时候的仓储可以通过配置文件进行初始加载,spring工程可以使用environment启动时注入
     */
    private static String DB = "Sqlserver";

    /**
     * 获取部门仓储层
     * 反射+抽象工厂实现
     *
     * @return 部门仓储层实例
     */
    public static IDepartmentRepository getDepartmentRepository() {
        IDepartmentRepository repository = (IDepartmentRepository)getInstance(PACKAGE_REFERENCE + DB + "DepartmentRepository");;
        //全类名: com.abstract_factory.repository.db + DB + DepartmentRepository
        return repository;
    }

    /**
     * 获取用户仓储层
     * 简单工厂+抽象工厂实现
     *
     * @return 用户仓储层实例
     */
    public static IUserRepository getUserRepository() {
        IUserRepository repository = null;
        switch (DB) {
            case "Sqlserver":
                repository = new SqlserverUserRepository();
                break;
            case "Mysql":
                repository = new MysqlUserRepository();
                break;
            default:
                throw new RuntimeException("error DB: " + DB);
        }
        return repository;
    }

    /**
     * 切换数据持久层
     *
     * @param db
     */
    public static void setDb(String db) {
        DataAccess.DB = db;
    }

    /**
     * 通过反射获取对象实例
     *
     * @param className
     * @return
     */
    private static Object getInstance(String className) {
        Object result = null;
        try {
            result = Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (InvocationTargetException
                | NoSuchMethodException
                | InstantiationException
                | IllegalAccessException
                | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
