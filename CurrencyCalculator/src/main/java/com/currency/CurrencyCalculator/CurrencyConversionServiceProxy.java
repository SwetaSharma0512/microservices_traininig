package com.currency.CurrencyCalculator;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name="currency-conversion", url="localhost:8200/")  
//@RibbonClient(name="currency-conversion")
public interface CurrencyConversionServiceProxy
{

	@GetMapping("/currency-conversion/retrieve/from/{from}/to/{to}")		//where {from} and {to} are path variable
	
	public CurrencyCalculatorBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to); 

}
