package edu.ncst.mvcweb.dao;

import edu.ncst.mvcweb.entity.Cost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface CostDao extends JpaRepository<Cost, Serializable> {
    Cost findByUsernameAndPassword(String username, String password);
}
