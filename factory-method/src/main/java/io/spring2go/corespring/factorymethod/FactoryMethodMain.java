package io.spring2go.corespring.factorymethod;

//客户端代码
public class FactoryMethodMain {
	
	public static void main(String[] args) {
		IFanFactory fanFactory = new PropellerFanFactory();
		
		// 使用工厂方法创建一个电扇
		IFan fan = fanFactory.createFan();
		
		// 使用创建的对象
		fan.swithOn();
		
		fan.switchOff();
	}


}
