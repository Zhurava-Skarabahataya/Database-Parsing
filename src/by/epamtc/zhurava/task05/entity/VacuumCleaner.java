package by.epamtc.zhurava.task05.entity;

public class VacuumCleaner implements Entity {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + PowerConsumption;
		result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
		result = prime * result + cleaningWidth;
		result = prime * result + ((filterType == null) ? 0 : filterType.hashCode());
		result = prime * result + motorSpeedReulation;
		result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VacuumCleaner other = (VacuumCleaner) obj;
		if (PowerConsumption != other.PowerConsumption)
			return false;
		if (bagType == null) {
			if (other.bagType != null)
				return false;
		} else if (!bagType.equals(other.bagType))
			return false;
		if (cleaningWidth != other.cleaningWidth)
			return false;
		if (filterType == null) {
			if (other.filterType != null)
				return false;
		} else if (!filterType.equals(other.filterType))
			return false;
		if (motorSpeedReulation != other.motorSpeedReulation)
			return false;
		if (wandType == null) {
			if (other.wandType != null)
				return false;
		} else if (!wandType.equals(other.wandType))
			return false;
		return true;
	}

}
