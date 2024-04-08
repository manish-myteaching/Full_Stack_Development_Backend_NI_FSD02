package com.professionalit.test;

import com.professionalit.comp.Employee;
import com.professionalit.comp.Food;

public class SoftwareCompany {

	public static void main(String[] args) {
	     //Software company needs  Employee
		     //create Dependent class obj
		      Food food=new Food();
		      //create Target class obj
		      Employee emp=new Employee(food);
		      emp.work();

	}

}
