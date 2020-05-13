package com.currency.CurrencyCalculator;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="currency-conversion", url="localhost:8200")  
public interface CurrencyCalculatorServiceProxy
{

}
