package com.test.jooq3.service;

import com.generator.tables.pojos.User;

import java.util.List;

/**
 * @author nzhang
 */
public interface UserService {
    /**
     * 根据id删除用户
     * @param id 用户id
     */
    void delete(int id);

    /**
     * 添加用户
     * @param user 用户
     */
    void insert(User user);

    /**
     * 跟新用户
     * @param user 用户
     * @return 返回更新的用户数
     */
    void update(User user);

    /**
     * 根据id查询用户信息
     * @param id 用户id
     * @return  返回用户信息
     */
    User getById(int id);

    /**
     * 获得全部用户信息
     * @return 返回全部用户信息
     */
    List<User> get();

}
