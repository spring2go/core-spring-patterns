package io.spring2go.corespring.singleton_v1_1;

// 静态块初始化单例
public class StaticBlockSingleton {
	private static final StaticBlockSingleton INSTANCE;

	// 私有构造函数，避免被客户端代码使用
	private StaticBlockSingleton() {}

	static {
		try {
			INSTANCE = new StaticBlockSingleton();
		} catch (Exception e) { // 异常处理
			throw new RuntimeException("Uffff, i was not expecting this!", e);
		}
	}

	public static StaticBlockSingleton getInstance() {
		return INSTANCE;
	}
}
