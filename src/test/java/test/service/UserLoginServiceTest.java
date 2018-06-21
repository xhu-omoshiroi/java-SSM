package test.service;

import entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserLoginService;
import test.BaseServiceTest;


/**
 * @Author: Lijie
 * @Date: 2018/6/20 13:22
 */
public class UserLoginServiceTest extends BaseServiceTest {

    @Autowired
    private UserLoginService userLoginService;

    @Test
    public void userRegisterTest(){
        User user = new User();
        user.setUserName("lijieTest1");
        user.setUserPassword("123456");
        user.setUserEmail("lijie@lijie.com");
        user.setUserNumber(1840123456);
        System.out.println(userLoginService.userRegister(user));
    }
    @Test
    public void userLoginTest(){
        User user = new User();
        user.setUserName("lijie");
        user.setUserPassword("123456");
        if (userLoginService.userLogin(user))
            System.out.println("登录成功");
        else System.out.println("登录失败");
    }
}