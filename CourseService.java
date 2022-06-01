package edu.ncst.mvcweb.service;

import edu.ncst.mvcweb.entity.Course;
import java.util.List;

public interface CourseService {
    List<Course> findAll();
    void delete(Integer id);
    void delete(List<Integer> idList);//定义两个同名接口，但是参数不同，叫做重载
    Course queryById(Integer id);
    Course save(Course course);
}
