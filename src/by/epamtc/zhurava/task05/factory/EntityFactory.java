package by.epamtc.zhurava.task05.factory;

import by.epamtc.zhurava.task05.entity.Entity;

public abstract class EntityFactory {

	public abstract Entity createEntity(String[] features);

	public static EntityFactory getFactory(String name) {

		switch (name) {

		case "Laptop": {

			return new LaptopFactory();
		}
		case "Oven": {

			return new OvenFactory();
		}
		case "Refrigerator": {

			return new RefrigeratorFactory();
		}
		case "VacuumCleaner": {

			return new VacuumCleanerFactory();
		}
		case "TabletPC": {

			return new TabletPCFactory();
		}
		case "Speakers": {

			return new SpeakersFactory();
		}
		default:
			return null;
		}

	}
}
