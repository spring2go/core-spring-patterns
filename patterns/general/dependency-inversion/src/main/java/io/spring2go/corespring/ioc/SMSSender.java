package io.spring2go.corespring.ioc;

public class SMSSender implements INotifier {

	public void notify(String message) {
		// 发送短消息
		System.out.println("Send SMS, message : " + message);
	}
}
