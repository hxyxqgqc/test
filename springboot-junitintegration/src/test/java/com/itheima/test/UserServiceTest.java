package com.itheima.test;


import com.itheima.SpringbootJunitintegrationApplication;
import com.itheima.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJunitintegrationApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        userService.add();
    }

}
