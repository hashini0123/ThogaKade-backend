package edu.icet.service;

import edu.icet.model.dto.ItemDTO;

import java.util.List;

public interface ItemService {

    boolean addItem(ItemDTO item);

    boolean updateItem(ItemDTO item);

    boolean deleteItem(String id);

    List<ItemDTO> getAll();
}
