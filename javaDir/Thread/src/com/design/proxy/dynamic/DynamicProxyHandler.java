package com.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 
 * @author liuwei
 *
 */
public class DynamicProxyHandler implements InvocationHandler {

	private Object object;

	public DynamicProxyHandler(final Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("DynamicProxyHandler买房前准备");
		Object result = method.invoke(object, args);
		System.out.println("DynamicProxyHandler买房后装修");
		return result;
	}
}
