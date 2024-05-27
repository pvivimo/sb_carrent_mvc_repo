package pv.sb_carrent_mvc.dto;

import java.util.List;

public class ReservationDtoList {
	
	private List<ReservationDto> reservationDtos;
	private List<CarDto> allCars;
	private CarDto rentedCar;
	
	
	public ReservationDtoList(List<ReservationDto> reservationDtos, List<CarDto> allCars, CarDto rentedCar) {
		super();
		this.reservationDtos = reservationDtos;
		this.allCars = allCars;
		this.rentedCar = rentedCar;
	}


	public List<ReservationDto> getReservationDtos() {
		return reservationDtos;
	}


	public void setReservationDtos(List<ReservationDto> reservationDtos) {
		this.reservationDtos = reservationDtos;
	}


	public List<CarDto> getAllCars() {
		return allCars;
	}


	public void setAllCars(List<CarDto> allCars) {
		this.allCars = allCars;
	}


	public CarDto getRentedCar() {
		return rentedCar;
	}


	public void setRentedCar(CarDto rentedCar) {
		this.rentedCar = rentedCar;
	}


	@Override
	public String toString() {
		return "ReservationDtoList [reservationDtos=" + reservationDtos + ", allCars=" + allCars + ", rentedCar="
				+ rentedCar + "]";
	}
	
	
	

}
