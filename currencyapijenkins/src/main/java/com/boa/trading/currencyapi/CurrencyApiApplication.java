package com.boa.trading.currencyapi;

//testing the pipeline
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication

//@EnableEurekaClient
public class CurrencyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyApiApplication.class, args);
	}

}
