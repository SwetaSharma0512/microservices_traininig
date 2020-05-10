package com.micro.Currency.CurrencyConversion;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyConversionRepository extends JpaRepository<CurrencyConersionValue, Long> 
{
	CurrencyConersionValue findByFromAndTo(String from, String to); 	 
}
