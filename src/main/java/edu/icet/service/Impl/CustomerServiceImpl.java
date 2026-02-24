package edu.icet.service.Impl;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.repository.CustomerRepository;
import edu.icet.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    final private CustomerRepository customerRepository;

    @Override
    public boolean addCustomer(CustomerDTO customer) {
        return customerRepository.addCustomer(customer);
    }

    @Override
    public boolean updateCustomer(CustomerDTO customer) {
        return customerRepository.updateCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(Integer id) {
        return customerRepository.deleteCustomer(id);
    }

    @Override
    public List<CustomerDTO> getAll() {
        return customerRepository.getAll();
    }
}
