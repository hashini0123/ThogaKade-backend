package edu.icet.repository.Impl;

import edu.icet.model.dto.OrderDTO;
import edu.icet.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {

    final private JdbcTemplate jdbcTemplate;

    @Override
    public boolean addOrder(OrderDTO orderDTO) {
        String sql = "INSERT INTO orders VALUE (?,?,?)";

        return jdbcTemplate.update(sql,
                orderDTO.getOrderID(),
                orderDTO.getOrderDate(),
                orderDTO.getCustID()
        )>0;
    }

    @Override
    public boolean updateOrder(OrderDTO orderDTO) {
        String sql = "UPDATE orders SET orderDate=?, custID=? WHERE orderID=?";

        return jdbcTemplate.update(sql,
                orderDTO.getOrderDate(),
                orderDTO.getCustID(),
                orderDTO.getOrderID()
        )>0;
    }

    @Override
    public boolean deleteById(String id) {
        String sql = "DELETE FROM orders WHERE orderID=?";

        return jdbcTemplate.update(sql,id)>0;
    }

//    @Override
//    public OrderDTO searchById(Integer id) {
//        return null;
//    }

    @Override
    public List<OrderDTO> getAll() {
        String sql = "SELECT * FROM orders";

        List<OrderDTO> orderDTOList = jdbcTemplate.query(sql,(rs, rowNum) -> {
           OrderDTO orderDTO = new OrderDTO();
           orderDTO.setOrderID(rs.getString(1));
           orderDTO.setOrderDate(rs.getDate(2));
           orderDTO.setCustID(rs.getString(3));
           return orderDTO;
        });
        return orderDTOList;
    }
}
