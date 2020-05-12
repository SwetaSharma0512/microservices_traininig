package com.micro.Currency.CurrencyConversion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyConversionFactorService

{
	@Autowired  
	CurrencyConversionRepository currencyrepo; 
	
	
	//getting all records  
	public List<CurrencyConersionValue> getAllConversionfactor()   
	{  
	List<CurrencyConersionValue> currencyfctor = new ArrayList<CurrencyConersionValue>();  
	currencyrepo.findAll().forEach(currencyfctor1 -> currencyfctor.add(currencyfctor1));  
	return currencyfctor;  
	} 
	
	
	//getting a specific record  
	public CurrencyConersionValue getconversionFactor(Long id)   
	{  
	return currencyrepo.findById(id).get();  
	}  
	
	//adding a specific record  
		public void  addconversionFactor(CurrencyConersionValue currencyFactor,Long id)   
		{  
			currencyrepo.save(currencyFactor); 
		}  
		
	
	//updating a specific record
	public void updateconversionFactor(CurrencyConersionValue currencyFactor, Long id)   
	{  
		
		currencyrepo.save(currencyFactor);  
	}  
	
	//saving data
	public void saveUpdateData(CurrencyConersionValue currencyFactor)   
	{  
		currencyrepo.save(currencyFactor);  
	} 
	
	
}

