package com.micro.Currency.CurrencyConversion;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyConversionRepository extends JpaRepository<CurrencyConversionValue, Long>
{
	CurrencyConversionValue findByFromAndTo(String from, String to); 
}