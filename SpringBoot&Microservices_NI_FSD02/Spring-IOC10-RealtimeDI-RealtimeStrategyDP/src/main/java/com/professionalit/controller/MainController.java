package com.professionalit.controller;

import com.professionalit.bo.Customer;
import com.professionalit.service.ICustomerMgmtService;
import com.professionalit.vo.CustomerVO;

public class MainController {
	private ICustomerMgmtService service;
	
	public MainController(ICustomerMgmtService service) {
		System.out.println("MainController: 1-param constructor");
		  this.service=service;
	}
	
	public  String  processCustomer(CustomerVO vo)throws Exception {
		//convert  VO class obj data to DTO class object data
		Customer customer=new Customer();
		customer.setCustName(vo.getCustName());
		customer.setCustAddrs(vo.getCustAddrs());
		customer.setPamt(Float.parseFloat(vo.getPamt()));
		customer.setTime(Float.parseFloat(vo.getTime()));
		customer.setRate(Float.parseFloat(vo.getRate()));
		//use service
		String result=service.calculateSimpleIntrest(customer);
		return result;
	}
	

}
