package io.spring2go.corespring.facade;

public interface IPaymentGateway {
	public boolean verifyCardDetails(String cardNo);
	public boolean processPayment(String cardNo, float cost);
}
