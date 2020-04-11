package org.java.demo;


import org.java.entity.Userinfo;
import org.java.service.UserInfoService;
import org.java.service.impl.UserInfoServiceImpl;
import org.junit.Test;

public class Demo {

    @Test
    public void test1(){
        UserInfoService userInfoService = new UserInfoServiceImpl();
        Userinfo userInfo = userInfoService.login("小明");
        System.out.println(userInfo);
    }
}
