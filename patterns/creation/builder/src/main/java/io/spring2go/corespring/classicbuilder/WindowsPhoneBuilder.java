package io.spring2go.corespring.classicbuilder;

// Windows手机具体构建者"ConcreteBuilder"
public class WindowsPhoneBuilder implements IMobilePhoneBuilder  {

	private MobilePhone phone;
	
	public WindowsPhoneBuilder() {
		this.phone = new MobilePhone("Windows Phone");
	}
	
	@Override
	public void buildScreen() {
		phone.setPhoneScreen(ScreenType.SCREENTYPE_TOUCH_CAPACITIVE);
	}

	@Override
	public void buildBattery() {
		phone.setPhoneBattery(Battery.MAH_2000);
	}

	@Override
	public void buildOS() {
		phone.setPhoneOS(OperatingSystem.WINDOWS_PHONE);
	}

	@Override
	public void buildStylus() {
		phone.setPhoneStylus(Stylus.NO);
	}

	@Override
	public MobilePhone getPhone() {
		return this.phone;
	}

}
