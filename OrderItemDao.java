package edu.ncst.mvcweb.dao;

import edu.ncst.mvcweb.entity.OrderItem;
import edu.ncst.mvcweb.entity.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemDao extends JpaRepository<OrderItem, Integer> {
    List<OrderItem> findOrderItemsByOrder(ProductOrder order);
}
