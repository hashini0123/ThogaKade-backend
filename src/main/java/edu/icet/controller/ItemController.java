package edu.icet.controller;

import edu.icet.model.dto.ItemDTO;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class ItemController {

    final private ItemService itemService;

    @PostMapping("/add")
    public boolean addItem(@RequestBody ItemDTO item){
        return itemService.addItem(item);
    }

    @PutMapping("/update")
    public boolean updateItem(@RequestBody ItemDTO item){
        return itemService.updateItem(item);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public boolean deleteById(@PathVariable Integer id){
        return itemService.deleteItem(id);
    }

    @GetMapping("/get")
    public List<ItemDTO> getAll(){
        return itemService.getAll();
    }


}
