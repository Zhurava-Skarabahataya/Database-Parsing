package by.epamtc.zhurava.task05.factory;

import by.epamtc.zhurava.task05.entity.Entity;
import by.epamtc.zhurava.task05.entity.Refrigerator;

public class RefrigeratorFactory extends EntityFactory{

	@Override
	public Entity createEntity(String[] features) {
		
		int powerConsumption = Integer.parseInt(features[2]);
		int weight = Integer.parseInt(features[4]);
		int freezerCapacity = Integer.parseInt(features[6]);
		double overallCapacity = Double.parseDouble(features[8]);
		int height = Integer.parseInt(features[10]);
		int width = Integer.parseInt(features[12]);

		return new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
	}

}
