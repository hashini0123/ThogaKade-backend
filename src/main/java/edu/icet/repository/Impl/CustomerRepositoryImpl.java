package edu.icet.repository.Impl;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.repository.CustomerRepository;

import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{

    @Override
    public boolean addCustomer(CustomerDTO customer) {
        return false;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customer) {
        return false;
    }

    @Override
    public boolean deleteCustomer(String id) {
        return false;
    }

    @Override
    public List<CustomerDTO> getAll() {
        return List.of();
    }
}
