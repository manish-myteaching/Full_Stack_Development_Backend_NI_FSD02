package com.professionalit.factory;

import com.professionalit.comp.Employee;
import com.professionalit.comp.Food;
import com.professionalit.comp.Person;
import com.professionalit.comp.Student;

public class PersonFactory {
	
	  //static  factory method   (having logic of factory pattern)
	public  static   Person   getPerson(String type) {
		      //create Dependent class object
		       Food food=new Food();
		       //create Target class obj
		       Person per=null;
		       if(type.equalsIgnoreCase("emp"))
		    	   per=new Employee(food);
		       else if(type.equalsIgnoreCase("stud"))
		    	   per=new  Student(food);
		       else
		    	    throw new IllegalArgumentException("invalid person type");
		       
		       return per;
	}//method
}//class
