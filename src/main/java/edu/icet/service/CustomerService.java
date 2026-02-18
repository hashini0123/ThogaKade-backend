package edu.icet.service;

import java.util.List;

public interface CustomerService {

    void addCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(Integer id);

    Customer serachById(Integer id);

    List<Customer> getAll();

}
