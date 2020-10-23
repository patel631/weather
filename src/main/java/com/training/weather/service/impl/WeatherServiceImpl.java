package com.training.weather.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.weather.entity.WeatherParameters;
import com.training.weather.repository.WeatherRepository;
import com.training.weather.service.WeatherService;

@Service("weatherService")
public class WeatherServiceImpl implements WeatherService {

	//@Autowired(required = true)
	private WeatherRepository repository;
	public WeatherServiceImpl(WeatherRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional
	public WeatherParameters insert(WeatherParameters weather) {
		return repository.insert(weather);
	}

}
