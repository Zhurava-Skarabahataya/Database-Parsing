package by.epamtc.zhurava.task05;

public class Speakers {

	private int powerConsumption;
	private int numberOfSpekers;
	private int cordLength;

	private String range;

	public Speakers(int powerConsumption, int numberOfSpekers, String range, int cordLength) {

		this.powerConsumption = powerConsumption;
		this.numberOfSpekers = numberOfSpekers;
		this.range = range;
		this.cordLength = cordLength;
	}

	@Override
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpekers=" + numberOfSpekers + ", range="
				+ range + ", cordLength=" + cordLength + "]";
	}

}
