package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.domain.User;
import com.itheima.service.UserService;

import java.util.List;

/**
 * Created by cdx on 2019/12/22.
 * desc:
 */
public class UserServiceImpl implements UserService {
    UserDao dao=new UserDaoImpl();

    public List<User> getAll() {
        return dao.getAll();
    }
}
