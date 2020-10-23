package com.training.weather.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WindParameters {

	@Id
	private String id;
	
	private float speed;
	
	private float degree;
	
	public WindParameters() {
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getDegree() {
		return degree;
	}

	public void setDegree(float degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "WindParameters [id=" + id + ", speed=" + speed + ", degree=" + degree + "]";
	}

	
	
}
