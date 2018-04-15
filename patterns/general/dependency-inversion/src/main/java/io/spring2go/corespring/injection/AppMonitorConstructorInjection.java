package io.spring2go.corespring.injection;

import io.spring2go.corespring.ioc.EventLogWriter;
import io.spring2go.corespring.ioc.INotifier;

public class AppMonitorConstructorInjection {
	// 事件通知器
	private INotifier notifier = null;
	
	public AppMonitorConstructorInjection(INotifier notifier) {
		this.notifier = notifier;
	}
	
	// 应用有问题时该方法被调用
	public void notify(String message) {
		notifier.notify(message);
	}
	
	public static void main(String[] args) {
		EventLogWriter writer = new EventLogWriter();
		AppMonitorConstructorInjection monitor = 
				new AppMonitorConstructorInjection(writer);
		monitor.notify("App has a problem ...");
	}
	
}
