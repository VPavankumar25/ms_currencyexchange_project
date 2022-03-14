package com.currencyms.currencysvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@EnableAutoConfiguration
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableJpaRepositories
@ComponentScan("com.currencyms")
public class CurrencyExchangeSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeSvcApplication.class, args);
	}

}
