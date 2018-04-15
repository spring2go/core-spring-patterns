package io.spring2go.corespring.ioc;

public class AppMonitorIOC {
	// 事件通知器
	private INotifier notifier = null;
	
	// 应用有问题时该方法被调用
	public void notify(String message) {
		if (notifier == null) {
			// 将抽象接口映射为具体类
			notifier = new EventLogWriter();
		}
		notifier.notify(message);
	}
	
	public static void main(String[] args) {
		AppMonitorIOC appMonitor = new AppMonitorIOC();
		appMonitor.notify("App has a problem ...");
	}
}
