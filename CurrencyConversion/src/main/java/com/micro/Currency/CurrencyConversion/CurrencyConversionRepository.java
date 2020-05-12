package com.micro.Currency.CurrencyConversion;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyConversionRepository extends JpaRepository<CurrencyConersionValue, Long> 
//public interface CurrencyConversionRepository extends CrudRepository 

{
	
	CurrencyConersionValue findByFromAndTo(String from, String to); 
	
	
}
