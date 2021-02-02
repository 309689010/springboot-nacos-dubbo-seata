package com.egg.core.interceptor;


import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 权限拦截
 * @author TengZhongBin
 * @since 2019/04/18
 */
public class AuthenticationInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object object) {
        // 如果不是映射到方法直接通过
        /* if (!(object instanceof HandlerMethod)) {
            return true;
        }
        String ignoreAuthKey = request.getParameter("ignorekey");
        if ("imboss666".equals(ignoreAuthKey)) { // 跳过授权
            return true;
        }

        System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHhh");*/
		// System.out.println("pass ****************");
        return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object o,
                           ModelAndView modelAndView){

	}

	@Override
	public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object o, Exception e){
	}
}