package com.currency.CurrencyCalculator;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.currency.CurrencyCalculator.CurrencyCalculatorBean;


@RestController
public class CurrencyCalculatorController 
{

	@GetMapping("/currency-calculator/from/{from}/to/{to}/quantity/{quantity}")
	
	private CurrencyCalculatorBean currencybean(@PathVariable String from,@PathVariable String to, @PathVariable BigDecimal quantity)
	{
	 return  new CurrencyCalculatorBean (1L, from,to,BigDecimal.ONE, quantity,quantity);
	}

		
}
