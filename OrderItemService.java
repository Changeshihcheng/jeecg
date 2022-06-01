package edu.ncst.mvcweb.service;

import edu.ncst.mvcweb.entity.OrderItem;

import java.util.List;

public interface OrderItemService {
    List<OrderItem> findAll();
    List<OrderItem> findByOrder(Integer orderId);
    OrderItem save(OrderItem orderItem);
}
