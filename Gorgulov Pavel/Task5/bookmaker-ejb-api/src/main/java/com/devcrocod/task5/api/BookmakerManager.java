package com.devcrocod.task5.api;

import com.devcrocod.task5.api.exception.BookmakerManagementException;
import com.devcrocod.task5.model.CustomerTO;

import java.util.List;

public interface BookmakerManager {

    String BEAN_NAME = "CustomerManagerSessionBean";

    CustomerTO getCustomerById(Long id) throws BookmakerManagementException;

    List<CustomerTO> getAllCustomer();

    Long saveCustomer(CustomerTO customerTO) throws BookmakerManagementException;

    boolean authorization(CustomerTO customerTO) throws BookmakerManagementException;

    boolean event(CustomerTO customerTO) throws BookmakerManagementException;
}
