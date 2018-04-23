package io.spring2go.corespring.decorator;

//Concrete Decorator
public class CherryDecorator extends Decorator {

	protected CherryDecorator(BakeryComponent baseComponent) {
		super(baseComponent);
		this.name = "Cherry";
		this.price = 2.0;
	}

}
