package edu.ncst.mvcweb.dao;


import edu.ncst.mvcweb.entity.ProductOrder;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductOrderDao extends PagingAndSortingRepository<ProductOrder, Integer> {

}
/*@Repository
public interface ProductOrderDao extends PagingAndSortingRepository<ProductOrder, Integer> {}*/


