package org.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(HttpServletRequest request) throws Exception {

        String err = (String) request.getAttribute("shiroLoginFailure");

        if (!StringUtils.isEmpty(err)){
            //用户名不存在UnknownAccountException
            if (err.endsWith("UnknownAccountException")){
                throw new Exception("用户名不存在");
            }
            //用户信息错误IncorrectCredentialsException
            if (err.endsWith("IncorrectCredentialsException")){
                throw new Exception("密码错误");
            }
        }

        //用户没有登录进入
        return "/login";
    }

    @RequestMapping("/logout")
    public String logout(){
        return "/login";
    }
}
