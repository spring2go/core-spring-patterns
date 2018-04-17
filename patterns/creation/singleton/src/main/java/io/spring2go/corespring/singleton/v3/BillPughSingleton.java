package io.spring2go.corespring.singleton.v3;

// 比尔.普夫单例
public class BillPughSingleton {
	// 私有构造函数，避免被客户端代码使用
	private BillPughSingleton() {}

	private static class LazyHolder {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return LazyHolder.INSTANCE;
	}
}