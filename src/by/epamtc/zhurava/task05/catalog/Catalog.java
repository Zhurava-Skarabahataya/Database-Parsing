package by.epamtc.zhurava.task05.catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.epamtc.zhurava.task05.entity.Entity;
import by.epamtc.zhurava.task05.factory.EntityFactory;

public class Catalog {

	String content;

	public Catalog(String content) {

		this.content = content;
	}

	public List<Entity> findEntities(String deviceName, String feature, String requirement) {

		List<Entity> entities = new ArrayList<Entity>();
		
		String regexForStringWithRequirement = deviceName + ".+" + feature + "=" + requirement + ".+";

		Pattern stringWithRequirement = Pattern.compile(regexForStringWithRequirement);
		
		Matcher matcher = stringWithRequirement.matcher(this.content);

		EntityFactory factory = EntityFactory.getFactory(deviceName);
		
		while (matcher.find()) {
			String line = matcher.group();

			String[] requirements = line.split("[ :,=]+");
			
			Entity product = factory.createEntity(requirements);

			entities.add(product);
		}

		return entities;
	}

}
