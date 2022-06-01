package edu.ncst.mvcweb.service;

import edu.ncst.mvcweb.entity.Coach;

import java.util.List;
public interface CoachService {
    List<Coach> findAll();
    void delete(Integer id);
    void delete(List<Integer> idList);//定义两个同名接口，但是参数不同，叫做重载
    Coach queryById(Integer id);
    Coach save(Coach coach);
}
