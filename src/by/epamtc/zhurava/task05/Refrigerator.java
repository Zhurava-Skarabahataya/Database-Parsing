package by.epamtc.zhurava.task05;

public class Refrigerator {

	private int powerConsumption;
	private int weight;
	private int freezerCapacity;
	private int height;
	private int width;
	
	private double overallCapacity;

	public Refrigerator(int powerConsumption, int weight, int freezerCapacity, double overallCapacity, int height,
			int width) {

		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Refrigerator [powerConsumption=" + powerConsumption + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overallCapacity=" + overallCapacity + ", height=" + height + ", width=" + width
				+ "]";
	}

}
