package io.spring2go.corespring.ioc;

public class SMSSender implements INotifier {

	public void notify(String message) {
		// ·¢ËÍ¶ÌÏûÏ¢
		System.out.println("Send SMS, message : " + message);
	}
}
