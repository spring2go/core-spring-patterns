package io.spring2go.corespring.simplefactory;

// 客户端代码
public class SimpleFactoryMain {

	public static void main(String[] args) {
		IFanFactory simpleFactory = new FanFactory();
		// 使用简单工厂创建一个电扇
		IFan fan = simpleFactory.createFan(FanType.TableFan);
		fan.swithOn();
		fan.switchOff();
	}

}
