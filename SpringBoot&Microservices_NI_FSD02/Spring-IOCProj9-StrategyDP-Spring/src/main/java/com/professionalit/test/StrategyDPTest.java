package com.professionalit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.professionalit.comp.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
	
		 // IOC Container creation
	    ApplicationContext context= new ClassPathXmlApplicationContext("./applicationContext.xml");
		//get Target class object
		Flipkart fpkt=context.getBean("fpkt",Flipkart.class);
		//invoke the b.method
		String result=fpkt.shopping(new String[] {"mangoes","tamarind","sugar canes"},
				                                                 new float[] {900.0f,300.0f, 100.0f }    );
		System.out.println(result);

	}

}
