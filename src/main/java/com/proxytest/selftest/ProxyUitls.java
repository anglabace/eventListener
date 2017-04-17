package proxytest.selftest;

import java.lang.reflect.Proxy;

public class ProxyUitls {
	static Object lookup(String classname){
		CalcInterface calc = null;
		try {
			Class clazz = Class.forName(classname);
			Object calcInterface=(CalcInterface)clazz.newInstance();
			CalcInvocationHandler calcInvocationHandler = new CalcInvocationHandler(calcInterface);
			calc = (CalcInterface)Proxy.newProxyInstance(calcInterface.getClass().getClassLoader(), calcInterface.getClass().getInterfaces(), calcInvocationHandler);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return calc;
	}
	
	public <T> T lookup(Class<T> clazz) {
		return (T) lookup(clazz.getName());
	}

}
