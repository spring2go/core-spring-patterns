package io.spring2go.corespring.simplefactory;

public class FanFactory implements IFanFactory {

	@Override
	public IFan createFan(FanType type) {
		switch (type) {
		case TableFan:
			return new TableFan();
		case CeilingFan:
			return new CeilingFan();
		case ExhaustFan:
			return new ExhaustFan();
		default:
			return new TableFan();
		}
	}

}
