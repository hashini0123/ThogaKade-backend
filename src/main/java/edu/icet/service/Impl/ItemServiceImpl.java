package edu.icet.service.Impl;

import edu.icet.model.dto.ItemDTO;
import edu.icet.service.ItemService;

import java.util.List;

public class ItemServiceImpl implements ItemService {
    @Override
    public boolean addItem(ItemDTO item) {
        return false;
    }

    @Override
    public boolean updateItem(ItemDTO item) {
        return false;
    }

    @Override
    public boolean deleteItem(Integer id) {
        return false;
    }

    @Override
    public List<ItemDTO> getAll() {
        return List.of();
    }
}
