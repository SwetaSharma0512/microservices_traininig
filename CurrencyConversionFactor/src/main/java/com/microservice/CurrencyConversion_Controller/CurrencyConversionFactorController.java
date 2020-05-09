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



@SpringBootApplication
@RestController

public class CurrencyConversionFactorController 
{

	/**
	@GetMapping("/CurrencyConversion/from/{from}/to/{to}")       //where {from} and {to} are path variable  
		public CurrencyConversionFactor retrieveCurrencyConversion(@PathVariable String from, @PathVariable String to)  //from map to USD and to map to INR  
		{     
		return new  CurrencyConversionFactor(1000L, from, to, BigDecimal.valueOf(65)); 
		}
	**/
	
	@Autowired  
	
	CurrencyConversionFactorService currencyfactorservice;	
  
		//creating a get mapping that retrieves all currency detail from the database   
		@GetMapping("/currency")  
		private List<CurrencyConversionFactor> getAllCurrency()   
		{  
		return currencyfacto	r.getAllCurrency();  
		} 
		
		//creating a get mapping that retrieves the detail of a specific currency  
		@GetMapping("/book/{bookid}")  
		private CurrencyConversionFactor getBooks(@PathVariable("bookid") int bookid)   
		{  
		return currencyfactor.getCurrency(bookid);  
		} 
		
		//creating a delete mapping that deletes a specified currency  
		@DeleteMapping("/book/{bookid}")  
		private void deleteBook(@PathVariable("bookid") int bookid)   
		{  
			currencyfactor.delete(bookid);  
		}  
		
		//creating post mapping that post the currency detail in the database  adding currency
		@PostMapping("/currency")  
		private int saveBook(@RequestBody CurrencyConversionFactor currencyconv)   
		{  
			currencyfactor.saveOrUpdate(currencyconv);  
		return currencyconv.getBookid();  
		} 
		
				
		//creating put mapping that updates the book detail   
		@PutMapping("/books")  
		private CurrencyConversionFactor update(@RequestBody CurrencyConversionFactor conversionfctr)   
		{  
			currencyfactor.saveOrUpdate(conversionfctr);  
		return conversionfctr;  	
		
}
}
