package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * Created by cdx on 2019/12/22.
 * desc:
 */
public interface UserDao {
    List<User> getAll();
}
