package edu.icet.repository;

import edu.icet.model.dto.CustomerDTO;

import java.util.List;

public interface CustomerRepository {

    boolean addCustomer(CustomerDTO customer);

    boolean updateCustomer(CustomerDTO customer);

    boolean deleteCustomer(Integer id);

    List<CustomerDTO> getAll();


}
