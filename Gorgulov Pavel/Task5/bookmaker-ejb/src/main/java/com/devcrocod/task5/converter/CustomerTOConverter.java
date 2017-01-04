package com.devcrocod.task5.converter;

import com.devcrocod.task5.domain.Customer;
import com.devcrocod.task5.model.CustomerTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Павел on 03.01.2017.
 */
public class CustomerTOConverter {

    public CustomerTO converter(Customer customer) {
        return new CustomerTO(
                customer.getId(),
                customer.getName(),
                customer.getPassword(),
                customer.getNumber(),
                customer.getSum());
    }

    public List<CustomerTO> convertAll(List<Customer> customersList) {
        List<CustomerTO> result = new ArrayList<CustomerTO>();
        for(Customer customer : customersList) {
            result.add(converter(customer));
        }
        return result;
    }
}
