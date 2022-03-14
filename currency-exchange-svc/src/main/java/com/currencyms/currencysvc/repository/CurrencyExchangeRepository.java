package com.currencyms.currencysvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.currencyms.currencysvc.entity.CurrencyExchange;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long> {
	
	CurrencyExchange findByFromAndTo(String from, String to);

}
