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

    @PostMapping("/add")
    public boolean addCustomer(@RequestBody CustomerDTO customer){
        return customerService.addCustomer(customer);
    }





    @GetMapping("/get")
    public List<CustomerDTO> getAll(){
        return customerService.getAll();
    }
}
