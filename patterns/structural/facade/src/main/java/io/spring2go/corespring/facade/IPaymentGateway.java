package io.spring2go.corespring.facade;

// 支付接口
public interface IPaymentGateway {
	public boolean verifyCardDetails(String cardNo);
	public boolean processPayment(String cardNo, float cost);
}
