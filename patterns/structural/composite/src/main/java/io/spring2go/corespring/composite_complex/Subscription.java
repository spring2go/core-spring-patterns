package io.spring2go.corespring.composite_complex;

public class Subscription {
	private SubscriptionType sType; // 订购类型
	private String name; // 名称
	private double cost; // 费用
	
	public SubscriptionType getsType() {
		return sType;
	}
	public void setsType(SubscriptionType sType) {
		this.sType = sType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}
