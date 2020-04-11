package org.java.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.java.entity.Userinfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class FirstController {

    @GetMapping("/")
    public String first(HttpSession session){
        System.out.println("-----进入控制器first------------");
        Userinfo userinfo = (Userinfo) SecurityUtils.getSubject().getPrincipal();
        session.setAttribute("userInfo",userinfo);
        return "/main";
    }
}
