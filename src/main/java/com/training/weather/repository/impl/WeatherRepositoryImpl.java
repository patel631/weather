package com.training.weather.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.training.weather.entity.WeatherParameters;
import com.training.weather.repository.WeatherRepository;

@Repository
public class WeatherRepositoryImpl implements WeatherRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public WeatherParameters insert(WeatherParameters weather) {
		
		weather.setWindParameters(weather.getWindParameters());
		em.persist(weather);
		return weather;
	}

}
