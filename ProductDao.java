package edu.ncst.mvcweb.dao;

import edu.ncst.mvcweb.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
/*public interface ProductDao extends JpaRepository<Product, Serializable> {
    Product findByProductName(String productName);
}*/
public interface ProductDao extends PagingAndSortingRepository<Product, Integer> {

}

