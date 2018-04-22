package io.spring2go.corespring.composite_simple;

// Component
public interface IEmployee {
	public void add(IEmployee employee);
	public void remove(IEmployee employee);
	public IEmployee getChild(int i);
	public String getName();
	public double getSalary();
	public void print();
}
