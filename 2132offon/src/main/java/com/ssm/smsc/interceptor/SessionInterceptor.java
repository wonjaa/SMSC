package com.ssm.smsc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession();
		
		String path = request.getServletPath();
		
		if(path.equals("/")){
			return true;
		}
		else if (session.getAttribute("userInfo") == null) {
			response.sendRedirect(request.getContextPath() + "/");
			return false;
		}
		return super.preHandle(request, response, handler);
	}
}
