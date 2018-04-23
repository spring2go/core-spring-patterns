package io.spring2go.corespring.decorator;

// ConcreteComponent
public class CakeBase implements BakeryComponent {

	private String name = "Cake Base";
	private double price = 200.0;
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

}
