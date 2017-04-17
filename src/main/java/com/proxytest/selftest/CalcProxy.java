package proxytest.selftest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CalcProxy implements InvocationHandler{
	
	private Object calcservice ;
	
	public CalcProxy(Object calcservice){
		this.calcservice=calcservice;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("开始处理前------------------------------------");
		method.invoke(calcservice, args);
		System.out.println("开始处理后------------------------------------");
		return null;
	}

}