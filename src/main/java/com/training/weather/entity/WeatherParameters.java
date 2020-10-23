package com.training.weather.entity;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PostPersist;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class WeatherParameters {
	
	@Id
	private String id;
	
	private String city;
	
	private String description;
	
	private float humidity;
	
	private float pressure;
	
	private float temp;
	
	private Timestamp timestamp;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JsonProperty("wind")
	private WindParameters wind;

	public WeatherParameters() {
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public WindParameters getWindParameters() {
		return wind;
	}

	public void setWindParameters(WindParameters wind) {
		this.wind = wind;
	}

	@Override
	public String toString() {
		return "WeatherParameters [id=" + id + ", city=" + city + ", description=" + description + ", humidity="
				+ humidity + ", pressure=" + pressure + ", temp=" + temp + ", timestamp=" + timestamp
				+ ", wind=" + wind + "]";
	}
	
}
