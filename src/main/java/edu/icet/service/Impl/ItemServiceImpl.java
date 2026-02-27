package edu.icet.service.Impl;

import edu.icet.model.dto.ItemDTO;
import edu.icet.repository.ItemRepository;
import edu.icet.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ItemServiceImpl implements ItemService {

    final private ItemRepository itemRepository;

    @Override
    public boolean addItem(ItemDTO item) {
        return itemRepository.addItem(item);
    }

    @Override
    public boolean updateItem(ItemDTO item) {
        return itemRepository.updateItem(item);
    }

    @Override
    public boolean deleteItem(String id) {
        return itemRepository.deleteItem(id);
    }

    @Override
    public List<ItemDTO> getAll() {
        return itemRepository.getAll();
    }
}
