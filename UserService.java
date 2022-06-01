package edu.ncst.mvcweb.service;

import edu.ncst.mvcweb.entity.User;

import java.util.List;

/*public interface UserService {
    User findByUsernameAndPassword(String username,String password);
    List<User> findAll();
}*/
public interface UserService {
    User findByUsernameAndPassword(String username,String password);
    List<User> findAll();
    void delete(Integer id);
    void delete(List<Integer> idList);//定义两个同名接口，但是参数不同，叫做重载
    User queryById(Integer id);
    User save(User user);
}
