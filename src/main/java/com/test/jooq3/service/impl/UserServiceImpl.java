package com.test.jooq3.service.impl;


import com.generator.tables.pojos.User;
import com.generator.tables.records.UserRecord;
import com.test.jooq3.service.UserService;
import org.jooq.BindingGetSQLInputContext;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.groups.Default;
import java.util.List;

/**
 * @author nzhang
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    DSLContext dslContext;
    /**
     * 为 com.generator.tables.User.USER重命名为u
     */
   private com.generator.tables.User u = com.generator.tables.User.USER.as("u");

    @Override
    public void delete(int id) {
        dslContext.delete(u).where(u.ID.eq(id)).execute();
    }

    /**
     * 这个测试还有问题
     * @param user 用户
     */
    @Override
    public void insert(User user) {
        dslContext.insertInto(com.generator.tables.User.USER).columns(com.generator.tables.User.USER.USER_NAME, com.generator.tables.User.USER.USER_AGE).values(user.getUserName(), user.getUserAge()).execute();



    }

    @Override
    public void update(User user) {
        dslContext.update(u).set(u.USER_NAME,user.getUserName()).set(u.USER_AGE,user.getUserAge()).where(u.ID.eq(user.getId())).execute();
    }

    @Override
    public User getById(int id) {
        List<User> list = dslContext.select().from(u).where(u.ID.eq(id)).fetchInto(User.class);
        return list.get(0);
    }

    @Override
    public List<User> get() {
        return dslContext.select().from(u).fetchInto(User.class);
    }
}
