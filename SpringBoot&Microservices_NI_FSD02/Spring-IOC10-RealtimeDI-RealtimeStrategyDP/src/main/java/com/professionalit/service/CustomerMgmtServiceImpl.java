package com.professionalit.service;

import com.professionalit.bo.Customer;
import com.professionalit.dao.ICustomerDAO;
import com.professionalit.dto.CustomerDTO;

public final class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	 private  ICustomerDAO  dao;  //HAS-A property
	 
	 public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		 System.out.println("CustomerMgmtServiceImpl.1-param constructor");
		 this.dao=dao;
	}

	@Override
	public String calculateSimpleIntrest(Customer dto) throws Exception {
		//calculate simple intrest amount  (b.logic)
		float intrAmt=(dto.getPamt()*dto.getRate()*dto.getTime())/100.0f;
		//create BO class obj having persistable data
		CustomerDTO bo=new CustomerDTO();
		bo.setCustName(dto.getCustName());
		bo.setCustAddrs(dto.getCustAddrs());
		bo.setPamt(dto.getPamt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setIntrestAmount(intrAmt);
		//use DAO
		int count=dao.insert(bo);
		  // terinary operator   <condition>?<sucess>:<failure>
		return  count==1?"Customer registered sucessfully---> SimpleIntrest amount::"+intrAmt:"Customer registration failed";   
	}

}
