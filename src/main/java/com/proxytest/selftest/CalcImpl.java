package proxytest.selftest;

public class CalcImpl implements CalcInterface {
	@Override
	public void exec() {
		System.out.println("开始计算！");
		System.out.println("结束计算！");
	}
}