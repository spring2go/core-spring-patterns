package io.spring2go.corespring.classicbuilder;

// 这是"Product"产品类
public class MobilePhone {
	// 部件类型
	private String phoneName;
	private ScreenType phoneScreen;
	private Battery phoneBattery;
	private OperatingSystem phoneOS;
	private Stylus phoneStylus;

	// region 访问手机组件的getter/setter公开方法
	public MobilePhone(String name) {
		this.phoneName = name;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public ScreenType getPhoneScreen() {
		return phoneScreen;
	}

	public void setPhoneScreen(ScreenType phoneScreen) {
		this.phoneScreen = phoneScreen;
	}

	public Battery getPhoneBattery() {
		return phoneBattery;
	}

	public void setPhoneBattery(Battery phoneBattery) {
		this.phoneBattery = phoneBattery;
	}

	public OperatingSystem getPhoneOS() {
		return phoneOS;
	}

	public void setPhoneOS(OperatingSystem phoneOS) {
		this.phoneOS = phoneOS;
	}

	public Stylus getPhoneStylus() {
		return phoneStylus;
	}

	public void setPhoneStylus(Stylus phoneStylus) {
		this.phoneStylus = phoneStylus;
	}
	// endregion

	@Override
	public String toString() {
		return String.format("Name: %s\nScreen: %s\nBattery: %s\nOS: %s\nStylus: %s\n", this.phoneName,
				this.phoneScreen, this.phoneBattery, this.phoneOS, this.phoneStylus);
	}
}
