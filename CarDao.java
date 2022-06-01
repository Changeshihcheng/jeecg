package edu.ncst.mvcweb.dao;

import edu.ncst.mvcweb.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface CarDao extends JpaRepository<Car, Serializable> {
    Car findByUsernameAndPassword(String username,String password);
}
