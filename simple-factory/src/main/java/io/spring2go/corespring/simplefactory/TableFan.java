package io.spring2go.corespring.simplefactory;

public class TableFan implements IFan {

	@Override
	public void swithOn() {
		System.out.println("The TableFan is swithed on ...");
	}

	@Override
	public void switchOff() {
		System.out.println("The TableFan is swithed off ...");
	}

}
