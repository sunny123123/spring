package com.payne.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.payne.bean.Persion;

@Configuration
public class BeanConfig {

	@Bean("persion")
	public Persion getPersion() {
		return new Persion("payne", "110");
	}
}
