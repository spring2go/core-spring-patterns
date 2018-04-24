package io.spring2go.corespring.facade;

public class FacadeMain {

	public static void main(String[] args) {
		// Creating the Order/Product details
		OrderDetails orderDetails = new OrderDetails("Java Design Pattern book",
				"Simplified book on design patterns in Java", 
				500, 10, "Street No 1", "Educational Area", 1212,
				"8811123456");
		
		// Using Facade
		OnlineShoppingFacade facade = new OnlineShoppingFacade();
		facade.finalizeOrder(orderDetails);

	}

}
