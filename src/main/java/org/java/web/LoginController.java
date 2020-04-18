package org.java.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.java.entity.Loginlog;
import org.java.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Date;

@Controller
public class LoginController {

    @Autowired
    private LoginLogService loginLogService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request) throws Exception {

        String err = (String) request.getAttribute("shiroLoginFailure");

        if (!StringUtils.isEmpty(err)){
            Subject currentUser = SecurityUtils.getSubject();
            Session session = currentUser.getSession();
            //用户名不存在UnknownAccountException
            if (err.endsWith("UnknownAccountException")){
//                throw new Exception("用户名不存在");
                System.out.println("用户名不存在");
            }
            //用户信息错误IncorrectCredentialsException
            if (err.endsWith("IncorrectCredentialsException")){
//                throw new Exception("密码错误");
                InetAddress ip4 = Inet4Address.getLocalHost();
                Loginlog loginlog = new Loginlog();
                loginlog.setLoginid(null);
                loginlog.setUserid(session.getAttribute("userId").toString());
                loginlog.setLogintime(new Date());
                loginlog.setIfsuccess(0);
                loginlog.setLoginuserip(ip4.toString());
                loginlog.setLogindesc("密码错误");
                loginLogService.addLog(loginlog);
                System.out.println("密码错误");
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
