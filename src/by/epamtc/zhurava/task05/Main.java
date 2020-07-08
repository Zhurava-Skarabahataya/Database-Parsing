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

		List<Object> results = new ArrayList<Object>();

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

		return sb.toString();
	}

	private static Object getProduct(String line) {

		String[] words = line.split("[ :,=]+");

		String productName = words[0];

		switch (productName) {

		case "Laptop": {

			return getNewLaptop(words);
		}
		case "Oven": {

			return getNewOven(words);
		}
		case "Refrigerator": {

			return getNewRefrigerator(words);
		}
		case "VacuumCleaner": {

			return getNewVacuumCleaner(words);
		}
		case "TabletPC": {

			return getNewTabletPC(words);
		}
		case "Speakers": {

			return getNewSpeakers(words);
		}
		}
		return null;
	}

	private static Object getNewSpeakers(String[] words) {

		int powerConsumption = Integer.parseInt(words[2]);
		int numberOfSpeakers = Integer.parseInt(words[4]);
		String frequencyOfRange = words[6];
		int cordLength = Integer.parseInt(words[8]);

		return new Speakers(powerConsumption, numberOfSpeakers, frequencyOfRange, cordLength);
	}

	private static Object getNewTabletPC(String[] words) {

		int batteryCapacity = Integer.parseInt(words[2]);
		int displayInches = Integer.parseInt(words[4]);
		int memoryRom = Integer.parseInt(words[6]);
		int flashMemoryCapacity = Integer.parseInt(words[8]);
		String color = words[10];

		return new TabletPC(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
	}

	private static Object getNewVacuumCleaner(String[] words) {

		int powerConsumption = Integer.parseInt(words[2]);
		String filterType = words[4];
		String bagType = words[6];
		String wandType = words[8];
		int motorSpeedReulation = Integer.parseInt(words[10]);
		int cleaningWidth = Integer.parseInt(words[12]);

		return new VacuumCleaner(powerConsumption, filterType, bagType, wandType, motorSpeedReulation, cleaningWidth);
	}

	private static Object getNewRefrigerator(String[] words) {

		int powerConsumption = Integer.parseInt(words[2]);
		int weight = Integer.parseInt(words[4]);
		int freezerCapacity = Integer.parseInt(words[6]);
		double overallCapacity = Double.parseDouble(words[8]);
		int height = Integer.parseInt(words[10]);
		int width = Integer.parseInt(words[12]);

		return new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
	}

	private static Object getNewOven(String[] words) {

		int powerConsumption = Integer.parseInt(words[2]);
		int weight = Integer.parseInt(words[4]);
		int capacity = Integer.parseInt(words[6]);
		int depth = Integer.parseInt(words[8]);
		double height = Double.parseDouble(words[10]);
		double width = Double.parseDouble(words[12]);

		return new Oven(powerConsumption, weight, capacity, depth, height, width);
	}

	private static Laptop getNewLaptop(String[] words) {

		double batteryCapacity = Double.parseDouble(words[2]);
		String os = words[4];
		int memoryRom = Integer.parseInt(words[6]);
		int systemMemory = Integer.parseInt(words[6]);
		double cpu = Double.parseDouble(words[8]);
		int displayInchs = Integer.parseInt(words[12]);

		return new Laptop(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
	}

}
