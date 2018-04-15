package io.spring2go.corespring.classicbuilder;

// 客户程序
public class ClassicBuilderMain {

	public static void main(String[] args) {
		// 先创建导演Director
		Manufacturer manufacturer = new Manufacturer();
		// 先准备Builder接口
		IMobilePhoneBuilder phoneBuilder = null;
		
		// 制造一部安卓手机
		phoneBuilder = new AndroidPhoneBuilder();
		manufacturer.construct(phoneBuilder);
		String output = String.format("A new Phone built:\n\n%s", phoneBuilder.getPhone().toString());
		System.out.println(output);
		
		// 制造一部Windows手机
		phoneBuilder = new WindowsPhoneBuilder();
		manufacturer.construct(phoneBuilder);
		output = String.format("A new Phone built:\n\n%s", phoneBuilder.getPhone().toString());
		System.out.println(output);
	}
}
