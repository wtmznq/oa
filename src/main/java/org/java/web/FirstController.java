package org.java.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.java.entity.Loginlog;
import org.java.entity.Sysfun;
import org.java.entity.Userinfo;
import org.java.service.LoginLogService;
import org.java.service.SysfunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;

@Controller
public class FirstController {

    @Autowired
    private LoginLogService loginLogService;
    @Autowired
    private SysfunService sysfunService;

    @GetMapping("/")
    public String first(HttpSession session) throws UnknownHostException {
        System.out.println("-----进入控制器first------------");
        Userinfo userinfo = (Userinfo) SecurityUtils.getSubject().getPrincipal();
        if (session.getAttribute("userInfo")==null){
            InetAddress ip4 = Inet4Address.getLocalHost();
            Loginlog loginlog = new Loginlog();
            loginlog.setLoginid(null);
            loginlog.setUserid(userinfo.getUserid());
            loginlog.setLogintime(new Date());
            loginlog.setIfsuccess(1);
            loginlog.setLoginuserip(ip4.toString());
            loginlog.setLogindesc("成功登录");
            loginLogService.addLog(loginlog);
        }
        session.setAttribute("userInfo",userinfo);


        List<Sysfun> menus = sysfunService.loadSysfun(userinfo.getUsername());
        session.setAttribute("menus",menus);
        return "/main";
    }

    @GetMapping("skip/{name}")
    public String skip(@PathVariable("name") String name){
        return "/"+name;
    }
}
