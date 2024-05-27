package pv.sb_carrent_mvc.dto;

import jakarta.persistence.Column;

public class CarDto {
	
	private String type;
	private int dailyRate;
	
	
	public CarDto() {
	
	}
	
	public CarDto(String type, int dailyRate) {
		super();
		this.type = type;
		this.dailyRate = dailyRate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(int dailyRate) {
		this.dailyRate = dailyRate;
	}

	@Override
	public String toString() {
		return "CarDto [type=" + type + ", dailyRate=" + dailyRate + "]";
	}
	
	


}
