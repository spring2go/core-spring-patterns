package io.spring2go.corespring.composite_complex;

import java.util.List;

public abstract class BaseEmployee implements IEmployee {
	
	protected String name;
	protected int employeeId;
	protected List<Subscription> subscriptions;
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int getEmployeeId() {
		return this.employeeId;
	}
	
	@Override
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	@Override
	public List<Subscription> getSubscriptions() {
		return this.subscriptions;
	}
	
	@Override
	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
}
