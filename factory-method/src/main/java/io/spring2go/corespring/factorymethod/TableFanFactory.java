package io.spring2go.corespring.factorymethod;

public class TableFanFactory implements IFanFactory {

	@Override
	public IFan createFan() {
		return new TableFan();
	}

}
