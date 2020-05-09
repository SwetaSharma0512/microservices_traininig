package com.microservice.CurrencyConversion_repo;


import com.microservice.CurrencyConversion_Service.CurrencyConversionFactor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;  

public interface CurrencyRepository extends JpaRepository <CurrencyConversionFactor , Integer>
{
	//CurrencyConversionFactor findByFromAndTo(String from, String to); 
}
