package com.professionalit.test;

import com.professionalit.comp.Person;
import com.professionalit.factory.PersonFactory;

public class College {

	public static void main(String[] args) {
	     //College needs Student
		  Person  per=PersonFactory.getPerson("stud");   
		  per.work();
	}

}
