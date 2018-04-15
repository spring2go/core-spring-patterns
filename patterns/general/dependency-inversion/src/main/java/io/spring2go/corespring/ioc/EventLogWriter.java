package io.spring2go.corespring.ioc;

public class EventLogWriter implements INotifier {

	public void notify(String message) {
		// 写到事件日志
		System.out.println("Write to event log, message : " + message);
	}

}
