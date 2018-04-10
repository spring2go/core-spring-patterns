package io.spring2go.corespring.factorymethod;

// 吊扇
public class CeilingFan implements IFan {

	@Override
	public void swithOn() {
		System.out.println("The CeilingFan is swithed on ...");
	}

	@Override
	public void switchOff() {
		System.out.println("The CeilingFan is swithed off ...");
	}
}
