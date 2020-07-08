package by.epamtc.zhurava.task05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {

		String deviceName = "Laptop";
		String feature = "OS";
		String requirement = "Windows";

		List<Object> results = new ArrayList();
		
		String textFromFile = readFromFile();

		String regexForStringWithRequirement = deviceName + ".+" + feature + "=" + requirement + ".+";

		Pattern stringWithRequirement = Pattern.compile(regexForStringWithRequirement);
		Matcher matcher = stringWithRequirement.matcher(textFromFile);

		while (matcher.find()) {
			String line = matcher.group();

			Object product = getProduct(line);
			
			results.add(product);
		}

		System.out.println(results.toString());
	}

	private static String readFromFile() throws IOException {

		File file = new File("database.txt");

		StringBuilder sb = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(
				new FileReader("src\\by\\epamtc\\zhurava\\task05\\database.txt"))) {

			String line = reader.readLine();

			while (line != null) {
				sb.append(line);
				sb.append("\n");
				line = reader.readLine();
			}
		}

		String textFromFile = sb.toString();

		return textFromFile;
	}

	private static Object getProduct(String line) {
		String[] words = line.split("[ :,=]+");

		String productName = words[0];

		switch (productName) {

		case "Laptop": {

			double batteryCapacity = Double.parseDouble(words[2]);
			String os = words[4];
			int memoryRom = Integer.parseInt(words[6]);
			int systemMemory = Integer.parseInt(words[6]);
			double cpu = Double.parseDouble(words[8]);
			int displayInchs = Integer.parseInt(words[12]);
			return new Laptop(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
		}

		case "Oven":{
			 int powerConsumption = Integer.parseInt(words[2]);
			 int weight = Integer.parseInt(words[4]);
			 int capacity = Integer.parseInt(words[6]);
			 int depth = Integer.parseInt(words[8]);
			 double height = Double.parseDouble(words[10]);
			 double width = Double.parseDouble(words[12]);
			 return new Oven(powerConsumption, weight, capacity, depth, height, width);
		}
		
		case "Refrigerator":{
			
		}
		case "VacuumCleaner":{
			
		}
		case "TabletPC":{
			
		}
		case "Speakers":{
			
		}
		
		}

		return null;
	}

}
