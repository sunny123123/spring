package com.payne.spring;

import javax.annotation.processing.SupportedAnnotationTypes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.payne.bean.Persion;

//@ContextConfiguration("classpath:application.xml")
//@RunWith(SpringRunner.class)
public class AppTest{

	@Autowired
	private Persion persion;
	@Autowired
	ApplicationContext applicationContext;
	
	@Test
	public void testContent() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		persion = (Persion)applicationContext.getBean("persion");
		System.out.println(persion);
		
	}
}
