package by.epamtc.zhurava.task05;

public class VacuumCleaner {

	private int PowerConsumption;
	private int motorSpeedReulation;
	private int cleaningWidth;
	
	private String bagType;
	private String filterType;
	private String wandType;

	public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType,
			int motorSpeedReulation, int cleaningWidth) {

		PowerConsumption = powerConsumption;
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeedReulation = motorSpeedReulation;
		this.cleaningWidth = cleaningWidth;
	}

	@Override
	public String toString() {
		return "VacuumCleaner [PowerConsumption=" + PowerConsumption + ", filterType=" + filterType + ", bagType="
				+ bagType + ", wandType=" + wandType + ", motorSpeedReulation=" + motorSpeedReulation
				+ ", cleaningWidth=" + cleaningWidth + "]";
	}

}
