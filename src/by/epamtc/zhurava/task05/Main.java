package by.epamtc.zhurava.task05;

import java.io.IOException;
import java.util.List;

import by.epamtc.zhurava.task05.catalog.Catalog;
import by.epamtc.zhurava.task05.entity.Entity;
import by.epamtc.zhurava.task05.reader.Reader;
import by.epamtc.zhurava.task05.reader.ReaderFromFile;

public class Main {

	public static void main(String[] args) throws IOException {

		String deviceName = "Laptop";
		String feature = "OS";
		String requirement = "Windows";
		
		Reader reader;
		reader = new ReaderFromFile();
		
		String textFromFile;
		textFromFile = reader.readFromFile();

		Catalog catalog;
		catalog = new Catalog(textFromFile);
		

		List<Entity> results;
		results = catalog.findEntities(deviceName, feature, requirement);

		System.out.println(results.toString());
	}

}
