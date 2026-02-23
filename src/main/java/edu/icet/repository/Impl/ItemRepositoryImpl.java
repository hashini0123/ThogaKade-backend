package edu.icet.repository.Impl;

import edu.icet.model.dto.ItemDTO;
import edu.icet.repository.ItemRepository;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepositoryImpl implements ItemRepository {

    final private JdbcTemplate jdbcTemplate;

    @Override
    public boolean addItem(ItemDTO item) {

        String sql = "INSERT INTO item VALUE(?,?,?,?,?)";

        return jdbcTemplate.update(sql,
                item.getItemCode(),
                item.getDescription(),
                item.getPackSize(),
                item.getUnitPrice(),
                item.getQtyOnHand()
                )>0;
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
