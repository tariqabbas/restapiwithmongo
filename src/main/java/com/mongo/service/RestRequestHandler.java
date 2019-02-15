package com.mongo.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.ContentCachingRequestWrapper;

import com.mongo.controller.LibraryController;

@Component
public class RestRequestHandler extends HandlerInterceptorAdapter {
	private static final Logger logger = LoggerFactory.getLogger(LibraryController.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		logger.debug("=======================inside preHandler========================");
		HttpServletRequest requestCacheWrapperObject = new ContentCachingRequestWrapper(request);
		Map<String, String[]> requestParamMaps = requestCacheWrapperObject.getParameterMap();
		logger.debug(requestParamMaps.toString());
		logger.debug("=======================Exit preHandler========================");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

}
