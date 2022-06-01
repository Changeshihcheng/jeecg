package edu.ncst.mvcweb.dao;

import edu.ncst.mvcweb.entity.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

@Repository
public interface CoachDao extends JpaRepository<Coach, Serializable> {
    Coach findByUsername(String username);
}
