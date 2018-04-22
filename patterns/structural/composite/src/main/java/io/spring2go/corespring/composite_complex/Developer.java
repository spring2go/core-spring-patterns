package io.spring2go.corespring.composite_complex;

// Leaf
public class Developer extends BaseEmployee {

	public Developer(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	
	public double getCost() {
		if (subscriptions== null)
			return 0;
		double cost = subscriptions.stream().mapToDouble(s -> s.getCost()).sum();
		return cost;
	}

	public int getSubscriptionCount(SubscriptionType type) {
		if (subscriptions == null)
			return 0;
		int count = (int) subscriptions.stream().filter(s -> s.getsType() == type).count();
		return count;
	}

}
