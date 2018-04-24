package io.spring2go.corespring.facade;

public class OnlineShoppingFacade {
	IInventory inventory = new InventoryManager();
	IOrderVerify orderVerify = new OrderVerificationManager();
	ICosting costManager = new CostManager();
	IPaymentGateway paymentGateway = new PaymentGatewayManager();
	ILogistics logistics = new LogisticsManager();
	
	public void finalizeOrder(OrderDetails orderDetails) {
		inventory.update(orderDetails.getProductNo());
		orderVerify.verifyShippingAddress(orderDetails.getPinCode());
		orderDetails.setPrice(
				costManager.applyDiscount(
						orderDetails.getPrice(), 
						orderDetails.getDiscountPercent()
				)
				);
		paymentGateway.verifyCardDetails(orderDetails.getCardNo());
		paymentGateway.processPayment(orderDetails.getCardNo(), orderDetails.getPrice());
		String shippingAddress = String.format("%s, %s - %d", 
				orderDetails.getAddressLine1(), 
				orderDetails.getAddressLine2(), 
				orderDetails.getPinCode());
		logistics.shipProducts(orderDetails.getCardNo(), shippingAddress);
	}
}
