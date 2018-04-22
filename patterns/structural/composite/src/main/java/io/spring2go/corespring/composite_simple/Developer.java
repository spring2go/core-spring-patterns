package io.spring2go.corespring.composite_simple;

import io.spring2go.corespring.composite_simple.IEmployee;

// leaf
public class Developer implements IEmployee {
	
	private String name;
	private double salary;
	
	public Developer(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(IEmployee employee) {
		String msg = "not supported by leaf node.";
		throw new UnsupportedOperationException(msg);
	}

	@Override
	public void remove(IEmployee employee) {
		String msg = "not supported by leaf node.";
		throw new UnsupportedOperationException(msg);
	}

	@Override
	public IEmployee getChild(int i) {
		String msg = "not supported by leaf node.";;
		throw new UnsupportedOperationException(msg);
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getSalary() {
		return this.salary;
	}

	@Override
	public void print() {
        System.out.println("-------------");
        System.out.println("Name ="+getName());
        System.out.println("Salary ="+getSalary());
        System.out.println("-------------");
	}
}
