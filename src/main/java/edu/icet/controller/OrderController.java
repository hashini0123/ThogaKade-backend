package edu.icet.controller;


import edu.icet.model.dto.OrderDTO;
import edu.icet.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin
@RequiredArgsConstructor
public class OrderController {

    final private OrderService orderService;

    @PostMapping("/add")
    public boolean addOrder(@RequestBody OrderDTO orderDTO){
        return orderService.addOrder(orderDTO);
    }

    @PutMapping("/update")
    public boolean updateOrder(@RequestBody OrderDTO orderDTO){
        return orderService.updateOrder(orderDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public boolean deleteById(@PathVariable String id){
        return orderService.deleteById(id);
    }

//    @GetMapping("/search-by-id/{id}")
//    public OrderDTO searchById(@PathVariable Integer id){
//        return orderService.searchById(id);
//    }

    @GetMapping("/getAll")
    public List<OrderDTO> getAll(){
        return orderService.getAll();
    }
}
