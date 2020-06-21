package com.currency.CurrencyCalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Component;


@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient

@EnableCircuitBreaker
@EnableHystrix

@EnableFeignClients("com.currency.CurrencyCalculator")
@Component

public class CurrencyCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyCalculatorApplication.class, args);
	}

}
