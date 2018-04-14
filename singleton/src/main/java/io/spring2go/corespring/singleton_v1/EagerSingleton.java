package io.spring2go.corespring.singleton_v1;

// 提前初始化单例
public class EagerSingleton {
	private static final EagerSingleton INSTANCE = new EagerSingleton();

	// 私有构造函数，避免被客户端代码使用
	private EagerSingleton() {}

	public static EagerSingleton getInstance() {
		return INSTANCE;
	}
}
