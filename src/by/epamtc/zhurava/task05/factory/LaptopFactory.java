package by.epamtc.zhurava.task05.factory;

import by.epamtc.zhurava.task05.entity.Entity;
import by.epamtc.zhurava.task05.entity.Laptop;

public class LaptopFactory extends EntityFactory{

	@Override
	public Entity createEntity(String[] features) {
		
		double batteryCapacity = Double.parseDouble(features[2]);
		String os = features[4];
		int memoryRom = Integer.parseInt(features[6]);
		int systemMemory = Integer.parseInt(features[6]);
		double cpu = Double.parseDouble(features[8]);
		int displayInchs = Integer.parseInt(features[12]);

		return new Laptop(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
	}

}
