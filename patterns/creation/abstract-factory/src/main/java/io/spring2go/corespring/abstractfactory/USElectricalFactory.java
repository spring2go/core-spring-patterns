package io.spring2go.corespring.abstractfactory;

public class USElectricalFactory  implements IElectricalFactory {

	public IFan createFan() {
		return new USFan();
	}

	public ITubeLight createTubeLight() {
		return new USTubeLight();
	}

}