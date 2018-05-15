package io.spring2go.patterns.template;

public class TemplateMethodMain {

	public static void main(String[] args) {
		CSVDataParser csvDataParser = new CSVDataParser();
		csvDataParser.process();
		System.out.println("**********************");
		DatabaseDataParser databaseDataParser = new DatabaseDataParser();
		databaseDataParser.process();
	}

}
