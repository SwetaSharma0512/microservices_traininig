package com.microservice.CurrencyConversion_repo;


import com.microservice.CurrencyConversion_Service.CurrencyConversionFactor;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyRepository extends CrudRepository <CurrencyConversionFactor , Integer>
{

}
