package com.payne.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.payne.bean.Persion;

/*
 * IOC xml方式
 */
public class AppBasedXml {
	
	public static void main( String[] args )
    {		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		Persion persion = (Persion)applicationContext.getBean("persion");
		System.out.println(persion);
		((ConfigurableApplicationContext)applicationContext).close();
		
    }

	
}
