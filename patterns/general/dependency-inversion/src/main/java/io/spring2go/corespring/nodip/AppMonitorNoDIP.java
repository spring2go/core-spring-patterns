package io.spring2go.corespring.nodip;

public class AppMonitorNoDIP {

	// 负责将事件日志写到日志系统
	private EventLogWriter writer = null;
	
	// 应用有问题时该方法将被调用
	public void notify(String message) {
		if (writer == null) {
			writer = new EventLogWriter();
		}
		writer.write(message);
	}
	
	public static void main(String[] args) {
		AppMonitorNoDIP appMonitor = new AppMonitorNoDIP();
		appMonitor.notify("App has a problem ...");
	}
}

class EventLogWriter {
	
	public void write(String message) {
		// 写到事件日志
		System.out.println("Write to event log, message : " + message);
	}
}


