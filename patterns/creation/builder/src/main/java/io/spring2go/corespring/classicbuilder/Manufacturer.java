package io.spring2go.corespring.classicbuilder;

// 这个是导演"Director"
public class Manufacturer {
	public void construct(IMobilePhoneBuilder phoneBuilder) {
		phoneBuilder.buildBattery();
		phoneBuilder.buildOS();
		phoneBuilder.buildScreen();
		phoneBuilder.buildStylus();
	}
}
