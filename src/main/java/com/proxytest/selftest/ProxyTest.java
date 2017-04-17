package proxytest.selftest;

import java.lang.reflect.Proxy;

public class ProxyTest {

	public static void main(String[] args) {
//		CalcInterface calcInterface = new CalcImpl();
//		CalcInvocationHandler calcInvocationHandler = new CalcInvocationHandler(calcInterface);
//		CalcInterface calc = (CalcInterface)Proxy.newProxyInstance(calcInterface.getClass().getClassLoader(), calcInterface.getClass().getInterfaces(), calcInvocationHandler);
//		calc.exec();
		
		CalcInterface calc =new ProxyUitls().lookup(CalcImpl.class);
		String dd =null;
		calc.exec();
		String dd2 =null;
		
		CalcInterface calc2 =new ProxyUitls().lookup(CalcImpl.class);
		calc2.exec();
	}

}
