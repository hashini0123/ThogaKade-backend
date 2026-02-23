package edu.icet.repository.Impl;

import edu.icet.model.dto.ItemDTO;
import edu.icet.repository.ItemRepository;
import edu.icet.service.ItemService;

import java.util.List;

public class ItemRepositoryImpl implements ItemRepository {


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
