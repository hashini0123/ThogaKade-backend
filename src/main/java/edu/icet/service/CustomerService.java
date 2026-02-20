package edu.icet.service;

import edu.icet.model.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    boolean addCustomer(CustomerDTO customer);



    List<CustomerDTO> getAll();

}
