package edu.ncst.mvcweb.dao;

import edu.ncst.mvcweb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Serializable> {
    User findByUsernameAndPassword(String username,String password);
}

