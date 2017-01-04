package com.devcrocod.task5.bean;

import com.devcrocod.task5.api.BookmakerManager;
import com.devcrocod.task5.api.exception.BookmakerManagementException;
import com.devcrocod.task5.converter.CustomerTOConverter;
import com.devcrocod.task5.domain.Customer;
import com.devcrocod.task5.model.CustomerTO;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Remote(BookmakerManager.class)
@Stateless(mappedName = BookmakerManager.BEAN_NAME)
public class CustomerManagerSessionBean implements BookmakerManager {

    @PersistenceContext(unitName = "bookmakerManager")
    private EntityManager entityManager;

    @Override
    public CustomerTO getCustomerById(Long id) throws BookmakerManagementException {
        Customer customer = entityManager.find(Customer.class, id);
        if (customer == null)
            throw new BookmakerManagementException("Customer with id: " + id + " is not exist");

        return new CustomerTOConverter().converter(customer);
    }

    @Override
    public List<CustomerTO> getAllCustomer() {
        TypedQuery<Customer> query = entityManager.createQuery("select c from CUSTOMER c", Customer.class);

        return new CustomerTOConverter().convertAll(query.getResultList());
    }

    @Override
    public Long saveCustomer(CustomerTO customerTO) throws BookmakerManagementException {
        if (customerTO == null) {
            throw new BookmakerManagementException("Customer can not be saved");
        }

        Customer customer = null;
        if (customerTO.getId() == null) {
            //add new customer
            customer = new Customer();
            customer.setName(customerTO.getName());
            customer.setPassword(customerTO.getPassword());
            customer.setNumber(customerTO.getNumber());
            customer.setSum(customerTO.getSum());
            entityManager.persist(customer);
        } else {
            //edit current user
            customer = entityManager.find(Customer.class, customerTO.getId());
            if (customer == null) {
                throw new BookmakerManagementException("Customer with id = " + customerTO.getId() + " is not exist");
            }
            customer.setName(customerTO.getName());
            customer.setNumber(customerTO.getNumber());
            customer.setSum(customer.getSum());
            entityManager.merge(customer);
        }

        return customer.getId();
    }

    @Override
    public boolean authorization(CustomerTO customerTO) throws BookmakerManagementException {
        if (customerTO == null) {
            throw new BookmakerManagementException("Customer can not be saved");
        }
        return customerTO.getPassword().equals(getCustomerById(customerTO.getId()).getPassword());
    }

    @Override
    public boolean event (CustomerTO customerTO) throws BookmakerManagementException{
        boolean flag = false;


        if (customerTO.getNumber()== play()){
            getCustomerById(customerTO.getId()).setSum((long) (customerTO.getSum()*getAllCustomer().size()*0.13));
            flag = true;
        }
        else
            flag = false;
        return flag;
    }

    private int play(){
        return (int)(100*Math.random());
    }
}
