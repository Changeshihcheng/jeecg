package edu.ncst.mvcweb.service;

import edu.ncst.mvcweb.entity.Product;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Map;

public interface ProductService {
    //Product findByProductName(String productName);
    List<Product> findAll();
    void delete(Integer id);
    void delete(List<Integer> idList);
    Product queryById(Integer id);
    Product save(Product product);
    Map<String, Object> findByPage(Pageable pageable);
}
