package com.project.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.core.NamedThreadLocal;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.project.utils.StringUtils;

/**
 * 拦截器，所有.shtml的请求都会走这个方法
 * @author Administrator
 * @since 2014-06-12
 */
public class ProjectInterceptor implements HandlerInterceptor {
	
	private static Logger logger = Logger.getLogger(ProjectInterceptor.class);
	private NamedThreadLocal<Long> startTimeThreadLocal = new NamedThreadLocal<Long>("StopWatch-StartTime");

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object obj, Exception e)
			throws Exception {
		long consumeTime = System.currentTimeMillis() - StringUtils.getLong(startTimeThreadLocal.get());
        String controllerMethod = request.getRequestURI();
		logger.info(controllerMethod + " : " + consumeTime + "ms");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		long consumeTime = System.currentTimeMillis();
        startTimeThreadLocal.set(consumeTime);
        return true;
	}
	
}
