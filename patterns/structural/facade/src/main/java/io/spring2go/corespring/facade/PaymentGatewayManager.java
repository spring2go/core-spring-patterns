package io.spring2go.corespring.facade;

// 支付实现
public class PaymentGatewayManager implements IPaymentGateway {

	@Override
	public boolean verifyCardDetails(String cardNo) {
		String out = "Card# " + cardNo + 
				" has been verified and is accepted.";
		System.out.println(out);
		return true;
	}

	@Override
	public boolean processPayment(String cardNo, float cost) {
		String out = "Card# " + cardNo + 
				" is used to make a payment of " + cost + ".";
		System.out.println(out);
		return true;
	}

}
