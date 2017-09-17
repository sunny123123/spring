package com.payne.MyBeanPostProcessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor{

	Logger logger = LoggerFactory.getLogger(MyBeanPostProcessor.class);
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		//logger.info("%s,%s before initialization", new Object[] {bean.toString(), beanName});
		logger.info(String.format("%s,%s before initialization", new Object[] {bean.toString(), beanName}));
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		//logger.info("%s,%s after initialization", new Object[] {bean.toString(), beanName});
		logger.info(String.format("%s,%s after initialization", new Object[] {bean.toString(), beanName}));
		return bean;
	}

}
