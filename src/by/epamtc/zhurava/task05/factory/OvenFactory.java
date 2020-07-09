package by.epamtc.zhurava.task05.factory;

import by.epamtc.zhurava.task05.entity.Entity;
import by.epamtc.zhurava.task05.entity.Oven;

public class OvenFactory extends EntityFactory {

	@Override
	public Entity createEntity(String[] features) {

		int powerConsumption = Integer.parseInt(features[2]);
		int weight = Integer.parseInt(features[4]);
		int capacity = Integer.parseInt(features[6]);
		int depth = Integer.parseInt(features[8]);
		double height = Double.parseDouble(features[10]);
		double width = Double.parseDouble(features[12]);

		return new Oven(powerConsumption, weight, capacity, depth, height, width);
	}

}
