package io.spring2go.corespring.nofactory;

public class NoFactoryMain {

	public static void main(String[] args) {
		TableFan fan = new TableFan();
		fan.switchOn();
	}

}

class TableFan {
	public void switchOn() {
		System.out.println("The TableFan is switched on ...");
	}
}
