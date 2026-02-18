package edu.icet.service.Impl;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

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

        List<CustomerDTO>



        return List.of();
    }
}
