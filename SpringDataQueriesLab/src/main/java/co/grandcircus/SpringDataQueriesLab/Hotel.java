package co.grandcircus.SpringDataQueriesLab;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("hotels")
public class Hotel {
	@Id
	private String id;
	@Field("hotelName")
	private String name;
	private String city;
	private Integer pricePerNight;

	public Hotel() {}

	public Hotel(String id, String name, String city, Integer pricePerNight) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}

	public Hotel(String name, String city, Integer pricePerNight) {
		this.name = name;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(Integer pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	
	
}
