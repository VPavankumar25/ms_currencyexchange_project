package com.currencyms.currencysvc.controller;

import org.apache.tomcat.jni.Local;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.config.environment.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currencyms.currencysvc.entity.CurrencyExchange;
import com.currencyms.currencysvc.repository.CurrencyExchangeRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private CurrencyExchangeRepository repository;
	
	//@Autowired
	//private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(
			@PathVariable String from,
			@PathVariable String to) {
		CurrencyExchange currencyExchange 
					= repository.findByFromAndTo(from, to);
		
		if(currencyExchange ==null) {
			throw new RuntimeException
				("Unable to Find data for " + from + " to " + to);
		}
		
	
		currencyExchange.setEnvironment("8001");
		
		return currencyExchange;
	}
}
