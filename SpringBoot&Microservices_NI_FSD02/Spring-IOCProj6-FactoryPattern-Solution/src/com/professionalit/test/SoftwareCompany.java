package com.professionalit.test;

import com.professionalit.comp.Person;
import com.professionalit.factory.PersonFactory;

public class SoftwareCompany {

	public static void main(String[] args) {
	     //Software company needs  Employee
		 Person  per=PersonFactory.getPerson("emp");   
		  per.work();

	}

}
