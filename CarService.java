package edu.ncst.mvcweb.service;

import edu.ncst.mvcweb.entity.Car;

import java.util.List;

public interface CarService {
    Car findByUsernameAndPassword(String username, String password);
    List<Car> findAll();
    void delete(Integer id);
    void delete(List<Integer> idList);//定义两个同名接口，但是参数不同，叫做重载
    Car queryById(Integer id);
    Car save(Car car);
}
