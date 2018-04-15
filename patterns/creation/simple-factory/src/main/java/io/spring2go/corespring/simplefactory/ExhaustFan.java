package io.spring2go.corespring.simplefactory;

public class ExhaustFan implements IFan {

	@Override
	public void swithOn() {
		System.out.println("The ExhaustFan is swithed on ...");
	}

	@Override
	public void switchOff() {
		System.out.println("The ExhaustFan is swithed off ...");
	}
}
