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

        String sql = "UPDATE item SET description=?, packSize=?, unitPrice=?, qtyOnHand=? WHERE itemCode=? ";

        return jdbcTemplate.update(sql,
                item.getDescription(),
                item.getPackSize(),
                item.getUnitPrice(),
                item.getQtyOnHand(),
                item.getItemCode()
                )>0;
    }

    @Override
    public boolean deleteItem(String id) {

        String sql = "DELETE FROM item WHERE itemCode=? ";

        return jdbcTemplate.update(sql,id)>0;
    }

    @Override
    public List<ItemDTO> getAll() {

        String sql= "SELECT * FROM item";

        List<ItemDTO> itemDTOList = jdbcTemplate.query(sql,(rs,rowNum )-> {

            ItemDTO itemDTO = new ItemDTO();

            itemDTO.setItemCode(rs.getString(1));
            itemDTO.setDescription(rs.getString(2));
            itemDTO.setPackSize(rs.getString(3));
            itemDTO.setUnitPrice(rs.getDouble(4));
            itemDTO.setQtyOnHand(rs.getInt(5));
            return itemDTO;
                });
        return itemDTOList;
    }
}
