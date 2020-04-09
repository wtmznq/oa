package org.java.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class FirstController {

    @GetMapping("/")
    public String first(HttpSession session){
        System.out.println("-----进入控制器first------------");
        Subject username = SecurityUtils.getSubject();
        session.setAttribute("username",username);
        return "/main";
    }
}
