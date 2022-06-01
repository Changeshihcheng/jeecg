package edu.ncst.mvcweb.service;

import edu.ncst.mvcweb.entity.OrderItem;
import edu.ncst.mvcweb.entity.ProductOrder;
import org.springframework.data.domain.Pageable;


import java.util.List;
import java.util.Map;


public interface ProductOrderService {
    Map<String, Object> findByPage(Pageable pageable);
    ProductOrder queryById(Integer id);
    ProductOrder save(ProductOrder order, List<OrderItem> orderItems);
}
/*public interface ProductOrderService {
    Map<String, Object> findByPage(Pageable pageable);
    ProductOrder queryById(Integer id);
    ProductOrder save(ProductOrder order, List<OrderItem> orderItems)
}
*/

