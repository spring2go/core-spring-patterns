package io.spring2go.corespring.factorymethod;

public class CeilingFanFactory implements IFanFactory {

	@Override
	public IFan createFan() {
		return new CeilingFan();
	}

}
