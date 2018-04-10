package io.spring2go.corespring.abstractfactory;

public class AbstractFactoryMain {

	public static void main(String[] args) {

		// 国产
		IElectricalFactory electricalFactory = new ChineseElectricalFactory();
		
		IFan fan = electricalFactory.createFan();
		
		fan.swithOn();
		
		// 美产
		electricalFactory = new USElectricalFactory();
		
		ITubeLight tubeLight = electricalFactory.createTubeLight();
		tubeLight.swithOn();
		tubeLight.tuneLight();

	}

}
