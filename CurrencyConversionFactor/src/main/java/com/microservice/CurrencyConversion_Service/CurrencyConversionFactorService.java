package com.microservice.CurrencyConversion_Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.CurrencyConversion_repo.*;

@Service
public class CurrencyConversionFactorService

{
	@Autowired  
	CurrencyRepository currencyrepo; 
	
	//getting all records  
	public List<CurrencyConversionFactor> getAllConversionfactor()   
	{  
	List<CurrencyConversionFactor> currencyfctor = new ArrayList<CurrencyConversionFactor>();  
	currencyrepo.findAll().forEach(currencyfctor1 -> currencyfctor.add(currencyfctor1));  
	return currencyfctor;  
	} 
	
	
	//getting a specific record  
	public CurrencyConversionFactor getconversionFactor(int id)   
	{  
	return currencyrepo.findById(id).get();  
	}  
	
	//adding a specific record  
		public void  addconversionFactor(CurrencyConversionFactor currencyFactor,int id)   
		{  
			currencyrepo.save(currencyFactor); 
		}  
		
	
	//updating a specific record
	public void updateconversionFactor(CurrencyConversionFactor currencyFactor, int id)   
	{  
		currencyrepo.save(currencyFactor);  
	}  
	
	//saving data
	public void saveUpdateData(CurrencyConversionFactor currencyFactor)   
	{  
		currencyrepo.save(currencyFactor);  
	} 
	
	
}

