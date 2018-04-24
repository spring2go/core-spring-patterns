package io.spring2go.corespring.facade;

// Client Code without Facade.
public class NoFacadeMain {

	public static void main(String[] args) {
		// Creating the Order/Product details
		OrderDetails orderDetails = new OrderDetails("Java Design Pattern book",
				"Simplified book on design patterns in Java", 
				500, 10, "Street No 1", "Educational Area", 1212,
				"8811123456");

		// Updating the inventory.
		IInventory inventory = new InventoryManager();
		inventory.update(orderDetails.getProductNo());

		// verifying various details for the order such as the shipping address.
		IOrderVerify orderVerify = new OrderVerificationManager();
		orderVerify.verifyShippingAddress(orderDetails.getPinCode());

		// Calculating the final cost after applying various discounts.
		ICosting costManager = new CostManager();
		orderDetails.setPrice(
				costManager.applyDiscount(
						orderDetails.getPrice(), 
						orderDetails.getDiscountPercent()
				)
				);

		// Going through various steps if payment gateway like card verification, \
		// charging from the card.
		IPaymentGateway paymentGateway = new PaymentGatewayManager();
		paymentGateway.verifyCardDetails(orderDetails.getCardNo());
		paymentGateway.processPayment(orderDetails.getCardNo(), orderDetails.getPrice());
		
		// Completing the order by providing logistics.
		ILogistics logistics = new LogisticsManager();
		String shippingAddress = String.format("%s, %s - %d", 
				orderDetails.getAddressLine1(), 
				orderDetails.getAddressLine2(), 
				orderDetails.getPinCode());
		logistics.shipProducts(orderDetails.getProductName(), shippingAddress);
	}

}
