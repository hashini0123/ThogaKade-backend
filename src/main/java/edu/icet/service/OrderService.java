package edu.icet.service;

import edu.icet.model.dto.OrderDTO;

public interface OrderService {
    boolean addOrder(OrderDTO orderDTO);

    boolean updateOrder(OrderDTO orderDTO);

    boolean deleteById(Integer id);

    OrderDTO searchById(Integer id);
}
