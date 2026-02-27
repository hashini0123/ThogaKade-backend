package edu.icet.controller;


import edu.icet.model.dto.OrderDTO;
import edu.icet.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin
@RequiredArgsConstructor
public class OrderController {

    final private OrderService orderService;

    @PostMapping("/add")
    public boolean addOrder(@RequestBody OrderDTO orderDTO){
        orderService.addOrder(orderDTO);
    }

    @PutMapping("/update")
    public boolean updateOrder(@RequestBody OrderDTO orderDTO){
        orderService.updateOrder(orderDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public boolean deleteById(@Integer id){
        orderService.deleteById(id);
    }

    @GetMapping("/search-by-id/{id}")
    public OrderDTO searchById(Integer id){
        return orderService.searchById(id);
    }





}
