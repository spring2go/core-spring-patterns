package io.spring2go.corespring.singleton_v2_2;

// 双重检查锁定单例
public class DoubleCheckLockingSingleton {
	private static volatile DoubleCheckLockingSingleton INSTANCE;

	// 私有构造函数，避免被客户端代码使用
	private DoubleCheckLockingSingleton() {}

	public static DoubleCheckLockingSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (DoubleCheckLockingSingleton.class) {
				// 双重检查
				if (INSTANCE == null) {
					INSTANCE = new DoubleCheckLockingSingleton();
				}
			}
		}
		return INSTANCE;
	}
}
