package edu.icet.service.Impl;

import edu.icet.model.dto.OrderDTO;
import edu.icet.repository.OrderRepository;
import edu.icet.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    final private OrderRepository orderRepository;

    @Override
    public boolean addOrder(OrderDTO orderDTO) {
        return orderRepository.addOrder(orderDTO);
    }

    @Override
    public boolean updateOrder(OrderDTO orderDTO) {
        return orderRepository.updateOrder(orderDTO);
    }

    @Override
    public boolean deleteById(String id) {
        return orderRepository.deleteById(id);
    }

//    @Override
//    public OrderDTO searchById(Integer id) {
//        return orderRepository.searchById(id);
//    }

    @Override
    public List<OrderDTO> getAll() {
        return orderRepository.getAll();
    }
}
