package com.spring;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class OurInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)	throws Exception {
		System.out.println("Pre Handle method - Before Controller Execution");
		
		String username = (String)request.getParameter("username");
        if (username != null && username.startsWith("p")) {
        	response.setContentType("text/html");
			response.getWriter().println("<h2>Invalid..! Name should not be start with 'p'</h2>");
			return false;
        }
		
        return true; // Proceed/forword with request
	}
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("post Handle method - After Controller Execution");
	}
	
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("After View Execution");
	}
}
