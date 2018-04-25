package io.spring2go.corespring.facade;

// 费用计算实现
public class CostManager implements ICosting {

	@Override
	public float applyDiscount(float price, float discountPercent) {
		String out = String.format(
				"A discount of %f%% has been applied on the product's price of %f", 
				discountPercent, price);
		System.out.println(out);
		return price - ((discountPercent / 100) * price);
	}

}
