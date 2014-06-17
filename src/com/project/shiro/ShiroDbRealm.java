package com.project.shiro;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.model.Users;
import com.project.service.IUsersService;
import com.project.shiro.utils.GlobalStatic;

/**
 * DB级数据库认证方法
 * @author Administrator
 *
 */
// 认证数据库存储
@Component
public class ShiroDbRealm extends AuthorizingRealm {
	
	private static Logger logger = Logger.getLogger(ShiroDbRealm.class);
	
	@Autowired
	private IUsersService usersService;
	@Resource
	private CacheManager shiroCacheManager;
	
	public static final String HASH_ALGORITHM = "MD5";
	public static final int HASH_INTERATIONS = 1;
	
	public ShiroDbRealm(){
		// 认证
		super.setAuthenticationCachingEnabled(false);
		// 授权
		super.setAuthorizationCacheName(GlobalStatic.authorizationCacheName);
	}

	/** 这里编写授权代码 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		/*// 因为非正常退出，即没有显示的调用 SecurityUtils.getSubject.logout()
		// (可能是关闭浏览器，或超时)，但此时缓存依旧存在（principals）, 所以会自己跑到授权方法里面
		if(!SecurityUtils.getSubject().isAuthenticated()){
			doClearCache(principals);
			SecurityUtils.getSubject().logout();
		}
		Users users = (Users) principals.getPrimaryPrincipal();
		String userId = users.getId();
		if(StringUtils.isBlank(userId)){
			return null;
		}
		// 添加角色和权限
		SimpleAuthorizationInfo sainfo = new SimpleAuthorizationInfo();
		try {
			sainfo.addRoles(usersService.getRolesAsString(userId));
			sainfo.addStringPermissions(usersService.getPermissionsAsString(userId));
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}
		return sainfo;*/
		return null;
	}

	/** 这里编写验证代码 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		/*UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		// 调用业务方法
		Users users = null;
		String username = upToken.getUsername();
		try {
			users = usersService.findLoginUser(username, null);
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}
		if(users!=null){
			AuthenticationInfo authInfo = new SimpleAuthenticationInfo(new ShiroUser(users),users.getPassword(),getName());
			return authInfo;
		}*/
		return null;
	}
	
	/**
	 * 设定Password校验的Hash算法与迭代次数.
	 */ 
	@PostConstruct
	public void initCredentialsMatcher() {
		HashedCredentialsMatcher matcher = new HashedCredentialsMatcher(
				HASH_ALGORITHM);
		matcher.setHashIterations(HASH_INTERATIONS);
		setCredentialsMatcher(matcher);
	} 

}
