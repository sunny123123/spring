package com.payne.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.payne.bean.Persion;


@Component
public class PersionService {
	@Autowired
	Persion persion;
	
	public void printPersion() {
		System.out.println(persion);
	}
}
