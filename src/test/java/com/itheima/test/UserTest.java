package com.itheima.test;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * Created by cdx on 2019/12/22.
 * desc:
 */
public class UserTest {
    @Test
    public void testuser(){
        UserService service = new UserServiceImpl();
        List<User> userlist = service.getAll();
        for (User user : userlist) {
            System.out.println(user);
        }

    }
}
