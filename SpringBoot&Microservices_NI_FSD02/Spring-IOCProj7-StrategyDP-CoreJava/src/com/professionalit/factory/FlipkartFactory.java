package com.professionalit.factory;

import com.professionalit.comp.BlueDart;
import com.professionalit.comp.Courier;
import com.professionalit.comp.DTDC;
import com.professionalit.comp.Flipkart;

public class FlipkartFactory {

	//static factory method  having factory patter logic
	  public static  Flipkart  getInstance(String courierType) {
		  
		  //create Dependent class obj
		    Courier courier=null;
		      if(courierType.equalsIgnoreCase("dtdc"))
		    	     courier=new DTDC();
		      else if(courierType.equalsIgnoreCase("bDart"))
		    	   courier=new BlueDart();
		      else 
		    	  throw new IllegalArgumentException("Invalid Courirer type");
		      
		      //create Target class obj
		       Flipkart  fpkt=new Flipkart();
		       //assign Dependent class obj to target class obj
		        fpkt.setCourier(courier);
		        return fpkt;
	  }
	
}
