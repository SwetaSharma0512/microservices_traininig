package com.currency.CurrencyCalculator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.currency.CurrencyCalculator.CurrencyCalculatorBean;
	

@RestController
public class CurrencyCalculatorController 
{
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
			
	
	@GetMapping("/currency-calculator/MS2/from/{from}/to/{to}/quantity/{quantity}")
	
	private CurrencyCalculatorBean currencybean1(@PathVariable String from,@PathVariable String to, @PathVariable BigDecimal quantity)
	{
	 return  new CurrencyCalculatorBean (1L, from,to,BigDecimal.ONE, quantity,quantity);
	}

	
/** Rest Template call to MS1
 * 	
	
		
	@GetMapping("/currency-calculator/from/{from}/to/{to}/quantity/{quantity}")

	public CurrencyCalculatorBean currencybean(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity)
	{
		
		
		RestTemplate restTemplate = new RestTemplate();
		
		String url="http://localhost:8200/currency-conversion/retrieve/from/{from}/to/{to}";
		
		Map<String, String> uriVariables=new HashMap<String, String>();  
		uriVariables.put("from", from);  
		uriVariables.put("to", to); 
		
		ResponseEntity<CurrencyCalculatorBean> responseEntity=restTemplate.getForEntity(url, CurrencyCalculatorBean.class, uriVariables); 
		
		
		System.out.print("Ms1 working bean---"+responseEntity);

		System.out.print("Ms1 working body---"+responseEntity.getBody());
		
		System.out.print("conversionMultiple value should come------"+ responseEntity.getBody().getConversionMultiple());
		
		
		logger.info("{}", responseEntity);
		
		return new CurrencyCalculatorBean(responseEntity.getBody().getId(), from,to, responseEntity.getBody().getConversionMultiple() , quantity, quantity.multiply(responseEntity.getBody().getConversionMultiple()));  
		
		
	}
**/	
	
	@Autowired  
	public CurrencyConversionServiceProxy proxy;
	
	@GetMapping("/currency-calculator-feign/from/{from}/to/{to}/quantity/{quantity}")
	
	public CurrencyCalculatorBean currencyfeign(@PathVariable String from,@PathVariable String to, @PathVariable BigDecimal quantity)
	{
		
		CurrencyCalculatorBean response= proxy.retrieveExchangeValue(from, to);
		//creating a new response bean
		//getting the response back and taking it into Bean
			
		System.out.println("Feign Ms---"+response.getFrom());
		System.out.println("Feign Ms conversion---"+response.getConversionMultiple());
		System.out.println("Feign Ms quamty---"+response.getQuantity());
		
		return new CurrencyCalculatorBean(response.getId(), from, to, response.getConversionMultiple(), quantity, quantity.multiply(response.getConversionMultiple()));
		
		
	}
	
}
