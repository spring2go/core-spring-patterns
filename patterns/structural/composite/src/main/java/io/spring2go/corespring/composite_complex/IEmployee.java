package io.spring2go.corespring.composite_complex;

import java.util.List;

//Component
public interface IEmployee {
	public String getName();
	
	public void setName(String name);
	
	public int getEmployeeId();
	
	public void setEmployeeId(int employeeId);
	
	public List<Subscription> getSubscriptions();
	
	public void setSubscriptions(List<Subscription> subscriptions);
	
	public double getCost();
	
	public int getSubscriptionCount(SubscriptionType type);
}
