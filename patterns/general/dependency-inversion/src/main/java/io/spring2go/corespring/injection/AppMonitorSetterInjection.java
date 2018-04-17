package io.spring2go.corespring.injection;

import io.spring2go.corespring.ioc.EventLogWriter;
import io.spring2go.corespring.ioc.INotifier;

public class AppMonitorSetterInjection {
	// 事件通知器
	private INotifier notifier = null;
	
	public void SetNotifier(INotifier notifier) {
		this.notifier = notifier;
	}
	
	// 应用有问题时该方法被调用
	public void notify(String message) {
		notifier.notify(message);
	}
	
	public static void main(String[] args) {
		EventLogWriter writer = new EventLogWriter();
		AppMonitorSetterInjection monitor = 
				new AppMonitorSetterInjection();
		// 可以在其它类中设置
		monitor.SetNotifier(writer);
		// 可以在其它类中调用
		monitor.notify("App has a problem ...");
	}
}
