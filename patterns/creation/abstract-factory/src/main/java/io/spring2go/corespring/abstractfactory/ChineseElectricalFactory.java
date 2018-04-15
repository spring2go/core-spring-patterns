package io.spring2go.corespring.abstractfactory;

public class ChineseElectricalFactory implements IElectricalFactory {

	public IFan createFan() {
		return new ChineseFan();
	}

	public ITubeLight createTubeLight() {
		return new ChineseTubeLight();
	}

}
