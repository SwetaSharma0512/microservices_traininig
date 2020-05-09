package com.microservice.CurrencyConversion_Controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;  

import com.microservice.CurrencyConversion_Service.*;
import com.microservice.CurrencyConversion_repo.*;


@SpringBootApplication
@RestController

public class CurrencyConversionFactorController 
{
 
	 
		@GetMapping("/CurrencyConversion/from/{from}/to/{to}")       //where {from} and {to} are path variable  
		public CurrencyConversionFactor retrieveExchangeValue(@PathVariable String from, @PathVariable String to)  //from map to USD and to map to INR  
		{     
		return new  CurrencyConversionFactor(1000, from, to, BigDecimal.valueOf(65));  
		}  
	
	
	/**	@Autowired  
  CurrencyRepository currencyrepos;	
	
	@GetMapping("/CurrencyConversion/from/{from}/to/{to}")       //where {from} and {to} are path variable  
		public CurrencyConversionFactor retrieveCurrencyConversion(@PathVariable String from, @PathVariable String to)  //from map to USD and to map to INR  
		{     
		
		CurrencyConversionFactor currencyfctr = currencyrepos.findByFromAndTo(from, to);  
		return currencyfctr;  
		}

	 @Autowired  
  CurrencyConversionFactorService currencyfactorservice;
	
  
		//creating a get mapping that retrieves all currency detail from the database   
		@GetMapping("/currencyConversion")  
		private List<CurrencyConversionFactor> getAllConversionfactor()   
		{  
		return currencyfactorservice.getAllConversionfactor();  
		} 
		
		
		//creating a get mapping that retrieves the detail of a specific currency  
		@GetMapping("/currencyConversion/{id}")  
		private CurrencyConversionFactor getconversionFactor1(@PathVariable("id") int id)   
		{  
		return currencyfactorservice.getconversionFactor(id);  
		} 
		
		
		
		//creating post mapping that post the currency detail in the database  adding currency
		@PostMapping("/currencyConversion")  
		private int saveUpdateData1(@RequestBody CurrencyConversionFactor currencyconv)   
		{  
			currencyfactorservice.saveUpdateData(currencyconv);  
		return currencyconv.getId();  
		} 
		
				
		//creating put mapping that updates the currency detail   
		@PutMapping("/currencyConversion")  
		private CurrencyConversionFactor update1(@RequestBody CurrencyConversionFactor conversionfctr)   
		{  
			currencyfactorservice.saveUpdateData(conversionfctr);  
		return conversionfctr; 
		}
		
		
		
		//creating put mapping that adds the currency detail   
				@PutMapping("/currencyConversion")  
				private CurrencyConversionFactor addCurrency(@RequestBody CurrencyConversionFactor conversionfctr)   
				{  
					currencyfactorservice.saveUpdateData(conversionfctr);  
				return conversionfctr; 
				}
**/
}
