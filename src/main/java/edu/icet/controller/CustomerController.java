package edu.icet.controller;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {

    final private CustomerService customerService;

    @PostMapping("/add-customer")
    public boolean addCustomer(@RequestBody CustomerDTO customer){
        return customerService.addCustomer(customer);
    }

    @PutMapping("/update-customer")
    public boolean updateCustomer(@RequestBody CustomerDTO customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/delete-by-id{id}")
    public boolean deleteById(Integer id){
        return customerService.deleteCustomer(id);
    }

    @GetMapping("/get-customer")
    public List<CustomerDTO> getAll(){
        return customerService.getAll();
    }
}
