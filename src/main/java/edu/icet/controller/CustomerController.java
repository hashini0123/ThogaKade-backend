package edu.icet.controller;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/add")
    public boolean addCustomer(@RequestBody CustomerDTO customer){
        return customerService.addCustomer(customer);
    }

    @PutMapping("/update")
    public boolean updateCustomer(@RequestBody CustomerDTO customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public boolean deleteById(@PathVariable Integer id){
        return customerService.deleteCustomer(id);
    }

    @GetMapping("/get")
    public List<CustomerDTO> getAll(){
        return customerService.getAll();
    }
}