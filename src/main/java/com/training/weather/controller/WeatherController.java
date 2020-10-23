package com.training.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.weather.entity.WeatherParameters;
import com.training.weather.service.WeatherService;

@RestController
@RequestMapping(value = "/weathers")
public class WeatherController {

	//@Autowired(required = true)
	private WeatherService service;
	public WeatherController(WeatherService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.POST)
	public WeatherParameters insert(@RequestBody WeatherParameters para) {
		return service.insert(para);
	}

}
