package edu.icet.repository;

import edu.icet.model.dto.OrderDTO;

import java.util.List;

public interface OrderRepository {
    boolean addOrder(OrderDTO orderDTO);

    boolean updateOrder(OrderDTO orderDTO);

    boolean deleteById(String id);

    //OrderDTO searchById(Integer id);

    List<OrderDTO> getAll();
}
