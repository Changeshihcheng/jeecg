package edu.ncst.mvcweb.service;

import edu.ncst.mvcweb.entity.Cost;

import java.util.List;

public interface CostService {
    Cost findByUsernameAndPassword(String username,String password);
    List<Cost> findAll();
    void delete(Integer id);
    void delete(List<Integer> idList);
    Cost queryById(Integer id);
    Cost save(Cost cost);
}
