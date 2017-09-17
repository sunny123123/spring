package com.payne.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.payne.bean.Persion;
import com.payne.config.BeanConfig;
import com.payne.service.PersionService;

/**
 * IOC java配置方式
 */
//@Import({BeanConfig.class,PersionService.class})
//@Configuration
@ComponentScan({"com.payne"})
public class AppBaseJavaConfiguration
{
	@Autowired
	Persion persion;
	
	@Autowired(required=false)
	PersionService persionService;
	
	public static void main( String[] args )
    {	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    	    ctx.register(AppBaseJavaConfiguration.class);
    	    ctx.refresh();
    		AppBaseJavaConfiguration app = ctx.getBean(AppBaseJavaConfiguration.class);
        System.out.println(app.getPersion());
        app.getPersionService().printPersion();
    }

	public Persion getPersion() {
		return persion;
	}

	public void setPersion(Persion persion) {
		this.persion = persion;
	}

	public PersionService getPersionService() {
		return persionService;
	}

	public void setPersionService(PersionService persionService) {
		this.persionService = persionService;
	}
	
	
}
