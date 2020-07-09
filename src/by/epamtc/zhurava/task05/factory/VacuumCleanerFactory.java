package by.epamtc.zhurava.task05.factory;

import by.epamtc.zhurava.task05.entity.Entity;
import by.epamtc.zhurava.task05.entity.VacuumCleaner;

public class VacuumCleanerFactory extends EntityFactory{

	@Override
	public Entity createEntity(String[] features) {
		int powerConsumption = Integer.parseInt(features[2]);
		String filterType = features[4];
		String bagType = features[6];
		String wandType = features[8];
		int motorSpeedReulation = Integer.parseInt(features[10]);
		int cleaningWidth = Integer.parseInt(features[12]);

		return new VacuumCleaner(powerConsumption, filterType, bagType, wandType, motorSpeedReulation, cleaningWidth);// TODO Auto-generated method stub
	}

}
