package by.epamtc.zhurava.task05.factory;

import by.epamtc.zhurava.task05.entity.Entity;
import by.epamtc.zhurava.task05.entity.TabletPC;

public class TabletPCFactory extends EntityFactory{

	@Override
	public Entity createEntity(String[] features) {
		
		int batteryCapacity = Integer.parseInt(features[2]);
		int displayInches = Integer.parseInt(features[4]);
		int memoryRom = Integer.parseInt(features[6]);
		int flashMemoryCapacity = Integer.parseInt(features[8]);
		String color = features[10];

		return new TabletPC(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
		
	}

}
