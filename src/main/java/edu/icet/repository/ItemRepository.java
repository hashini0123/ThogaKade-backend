package edu.icet.repository;

import edu.icet.model.dto.ItemDTO;

import java.util.List;

public interface ItemRepository {

    boolean addItem(ItemDTO item);

    boolean updateItem(ItemDTO item);

    boolean deleteItem(Integer id);

    List<ItemDTO> getAll();
}
