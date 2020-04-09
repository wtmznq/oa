package org.java.config;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.java.realm.AuthRealm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {


    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        shiroFilterFactoryBean.setLoginUrl("/login");

        Map<String,String> shiroFilterDefinitionMap = new LinkedHashMap<>();
        shiroFilterDefinitionMap.put("/logout","logout");
        shiroFilterDefinitionMap.put("/css/**","anon");
        shiroFilterDefinitionMap.put("/fonts/**","anon");
        shiroFilterDefinitionMap.put("/images/**","anon");
        shiroFilterDefinitionMap.put("/js/**","anon");
        shiroFilterDefinitionMap.put("/lib/**","anon");
        shiroFilterDefinitionMap.put("/**","authc");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(shiroFilterDefinitionMap);
        return shiroFilterFactoryBean;
    }

    /**
     * 安全管理器
     * @return
     */
    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(authRealm());
        return securityManager;
    }


    @Bean
    public AuthRealm authRealm(){
        AuthRealm authRealm = new AuthRealm();
        return authRealm;
    }
}
