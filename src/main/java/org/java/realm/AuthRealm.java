package org.java.realm;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.session.HttpServletSession;
import org.java.entity.Userinfo;
import org.java.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;


public class AuthRealm extends AuthorizingRealm {

    @Autowired
    private UserInfoService userInfoService;
    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        String principal = (String) token.getPrincipal();

        Userinfo userInfo = userInfoService.login(principal);

        if (userInfo==null){
            return null;
        }
        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();
        session.setAttribute("userId",userInfo.getUserid());
        String pwd = userInfo.getPassword();
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userInfo,pwd,"myRealm");
        return info;
    }
}
