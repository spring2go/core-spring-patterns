package io.spring2go.corespring.composite_simple;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Manager implements IEmployee {

	private String name;
	private double salary;
	private List<IEmployee> employees = new ArrayList<IEmployee>();

	public Manager(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(IEmployee employee) {
		employees.add(employee);
	}

	@Override
	public void remove(IEmployee employee) {
		employees.remove(employee);
	}

	@Override
	public IEmployee getChild(int i) {
		return employees.get(i);
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
		System.out.println("Name =" + getName());
		System.out.println("Salary =" + getSalary());
		System.out.println("-------------");
		
		for(IEmployee employee : this.employees) {
			employee.print();
		}
	}
}
