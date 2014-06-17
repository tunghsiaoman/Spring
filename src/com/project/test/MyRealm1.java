package com.project.test;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.Realm;

public class MyRealm1 implements Realm {

	@Override
	public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token)
			throws AuthenticationException {
		// 得到用户名
		String username = (String) token.getPrincipal();
		// 得到密码
		String password = new String((char[])token.getCredentials());
		if(!"tunghsiaoman".equals(username)){
			// 若用户名错误
			throw new UnknownAccountException();
		}
		if(!"123456".equals(password)) {  
			 // 如果密码错误
            throw new IncorrectCredentialsException();
        } 
		// 若身份验证成功，则返回一个AuthenticationInfo的实现
		return new SimpleAuthenticationInfo(username,password,getName());
	}

	@Override
	public String getName() {
		return "MyRealm1";
	}

	@Override
	public boolean supports(AuthenticationToken token) {
		//仅支持UsernamePasswordToken类型的Token
		return token instanceof UsernamePasswordToken;
	}

}
