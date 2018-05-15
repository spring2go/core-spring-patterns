package io.spring2go.patterns.template;

public class CSVDataParser extends DataParser {

	@Override
	void readData() {
		System.out.println("Reading data from csv file");
	}

	@Override
	void processData() {
		System.out.println("Looping through loaded csv file");
	}

}
