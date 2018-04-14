package io.spring2go.corespring.singleton_reflection;

import java.lang.reflect.Constructor;

public class ReflectionTest {

	public static void main(String[] args) {
		ReflectionSingleton instanceOne = ReflectionSingleton.getInstance();
		ReflectionSingleton instanceTwo = null;
		try {
			Constructor constructor = ReflectionSingleton.class.getDeclaredConstructor();
			// 下面的代码会打破单例
			constructor.setAccessible(true);
			// 创建第二个实例
			instanceTwo = (ReflectionSingleton) constructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}
}