package com.micro.Currency.CurrencyConversion;

import java.math.BigDecimal;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication  
@RestController
public class CurrencyConversionController 

{
	@GetMapping("/currency-conversion/from/{from}/to/{to}")       //where {from} and {to} are path variable  
	public CurrencyConersionValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to)  //from map to USD and to map to INR  
	{     
	return new  CurrencyConersionValue(1000, from, to, BigDecimal.valueOf(65));  
	}  
	
}
