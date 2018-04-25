package io.spring2go.corespring.facade;

// 订单校验接口
public interface IOrderVerify {
	public boolean verifyShippingAddress(int pincode);
}
