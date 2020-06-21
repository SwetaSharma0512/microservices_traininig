package com.currency.CurrencyCalculator;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name="currency-conversion")  
@RibbonClient(name="currency-conversion")
@Component
public interface CurrencyConversionServiceProxy
{

	@GetMapping(value="/currency-conversion/retrieve/from/{from}/to/{to}")		//where {from} and {to} are path variable
	
	public CurrencyCalculatorBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to); 

}
