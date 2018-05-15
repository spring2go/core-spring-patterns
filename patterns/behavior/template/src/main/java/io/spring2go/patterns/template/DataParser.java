package io.spring2go.patterns.template;

abstract class DataParser {
	
	// generic data processing flow
	public final void process() {
		readData();
		processData();
		writeData();
	}
	
	// implemented by subclass
	abstract void readData();
	abstract void processData();
	
	// same for all subclass
	public void writeData() {
		System.out.println("Ouput generated, writing to CSV");
	}
}
