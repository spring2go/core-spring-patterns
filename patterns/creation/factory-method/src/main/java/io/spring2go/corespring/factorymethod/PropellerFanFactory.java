package io.spring2go.corespring.factorymethod;

public class PropellerFanFactory implements IFanFactory {

	@Override
	public IFan createFan() {
		return new PropellerFan();
	}

}
