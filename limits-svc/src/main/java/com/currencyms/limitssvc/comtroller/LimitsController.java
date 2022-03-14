package com.currencyms.limitssvc.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.currencyms.limitssvc.entity.Limits;

@RestController
public class LimitsController {
	
	@Autowired
	private Limits limits;
	
	@GetMapping("/limits")
	public Limits getLimits()
	{
		return new Limits(limits.getMinimum(),limits.getMaximum());
	}

}
