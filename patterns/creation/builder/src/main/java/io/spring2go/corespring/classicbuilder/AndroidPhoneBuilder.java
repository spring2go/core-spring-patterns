package io.spring2go.corespring.classicbuilder;

// 安卓手机具体构建者"ConcreteBuilder"
public class AndroidPhoneBuilder implements IMobilePhoneBuilder {
	
	private MobilePhone phone;

	public AndroidPhoneBuilder() {
		this.phone = new MobilePhone("Android Phone");
	}
	
	@Override
	public void buildScreen() {
		phone.setPhoneScreen(ScreenType.SCREENTYPE_TOUCH_RESISTIVE);
	}

	@Override
	public void buildBattery() {
		phone.setPhoneBattery(Battery.MAH_1500);
	}

	@Override
	public void buildOS() {
		phone.setPhoneOS(OperatingSystem.ANDROID);
	}

	@Override
	public void buildStylus() {
		phone.setPhoneStylus(Stylus.YES);
	}

	// 获得最终构建出来的产品
	@Override
	public MobilePhone getPhone() {
		return this.phone;
	}
}
