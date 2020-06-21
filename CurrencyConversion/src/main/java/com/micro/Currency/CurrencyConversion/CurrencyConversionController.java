package com.micro.Currency.CurrencyConversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication  
@RestController
public class CurrencyConversionController {
	@Autowired  
	private CurrencyConversionRepository repository;
	
		
	@GetMapping("/currency-conversion/retrieve/from/{from}/to/{to}")       //where {from} and {to} are path variable  
	public CurrencyConversionValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to)  //from map to USD and to map to INR  
	{     
		CurrencyConversionValue currencyValue=repository.findByFromAndTo(from,to);  
		System.out.println("from adn to:" +from +" "+ to);
		return  currencyValue;
			
	}
	
	
	@GetMapping("/currency-conversion/retrieve/id/{id}")  
	private CurrencyConversionValue getconversionFactor(@PathVariable("id") Long id)   
	{  
	return getconversionFactor(id);  
	}  
}

