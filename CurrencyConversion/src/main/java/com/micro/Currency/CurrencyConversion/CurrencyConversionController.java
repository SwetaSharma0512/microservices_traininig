package com.micro.Currency.CurrencyConversion;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication  
@RestController
public class CurrencyConversionController 

{
	@Autowired  
	private CurrencyConversionRepository repository;
	
	@Autowired  
	public CurrencyConversionFactorService curencyservice;
	
		
	@GetMapping("/currency-conversion/retrieve/from/{from}/to/{to}")       //where {from} and {to} are path variable  
	public CurrencyConersionValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to)  //from map to USD and to map to INR  
	{     
		CurrencyConersionValue currencyValue=repository.findByFromAndTo(from,to);  
		return  currencyValue;
	}
	
		
	@GetMapping("/currency-conversion/retrieve/id/{id}")  
	private CurrencyConersionValue getconversionFactor(@PathVariable("id") Long id)   
	{  
	return curencyservice.getconversionFactor(id);  
	}  
	
/**	
	//creating put mapping that adds the currency detail   

	@PutMapping("/currency-conversion/update/id/{id}/to_currencyvalue/{crncy}")  
	private CurrencyConersionValue updateconversionFactor(@RequestBody CurrencyConersionValue crncy, @RequestBody Long id)   
	{  
		curencyservice.saveUpdateData(crncy);  
	return crncy;  
	}
	
	
	
	@PostMapping("/currency-conversion/add")  
	private String addconversionFactor(@RequestBody CurrencyConersionValue crncy,@RequestBody Long id)   
	{  
		curencyservice.saveUpdateData(crncy);  
		return "Success";   
	} 
	**/
}