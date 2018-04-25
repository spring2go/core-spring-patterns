package io.spring2go.corespring.facade;

// 订单校验实现
public class OrderVerificationManager implements IOrderVerify {

	@Override
	public boolean verifyShippingAddress(int pincode) {
		System.out.println(
				"The product can be shipped to the pincode "
		        + pincode);
		return true;
	}

}
