package edu.ncst.mvcweb.dao;

import edu.ncst.mvcweb.entity.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface AdministratorDao extends JpaRepository<Administrator, Serializable> {
    Administrator findByUsernameAndPassword(String username, String password);
}
