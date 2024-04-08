package com.professionalit.dao;

import com.professionalit.dto.CustomerDTO;

public interface ICustomerDAO {
    public int  insert(CustomerDTO bo)throws Exception;
}
