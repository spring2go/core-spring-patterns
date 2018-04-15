package io.spring2go.corespring.factorymethod;

public class ExhaustFanFactory implements IFanFactory {

	@Override
	public IFan createFan() {
		return new ExhaustFan();
	}

}
