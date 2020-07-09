package by.epamtc.zhurava.task05.factory;

import by.epamtc.zhurava.task05.entity.Entity;
import by.epamtc.zhurava.task05.entity.Speakers;

public class SpeakersFactory extends EntityFactory{

	@Override
	public Entity createEntity(String[] features) {
		
		int powerConsumption = Integer.parseInt(features[2]);
		int numberOfSpeakers = Integer.parseInt(features[4]);
		String frequencyOfRange = features[6];
		int cordLength = Integer.parseInt(features[8]);

		return new Speakers(powerConsumption, numberOfSpeakers, frequencyOfRange, cordLength);
	
	}

}
