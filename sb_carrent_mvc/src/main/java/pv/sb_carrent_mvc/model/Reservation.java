package pv.sb_carrent_mvc.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "id")
	private String name;
	
	@Column(name = "id")
	private String email;
	
	@Column(name = "id")
	private String address;
	
	@Column(name = "id")
	private String phoneNumber;
	
	@Column(name = "id")
	private LocalDate startDate;
	
	@Column(name = "id")
	private LocalDate endDate;
	
	@Column(name = "id")
	private int carId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", startDate=" + startDate + ", endDate=" + endDate + ", carId="
				+ carId + "]";
	}
	
	
	

}
