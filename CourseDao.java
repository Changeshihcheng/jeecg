package edu.ncst.mvcweb.dao;

import edu.ncst.mvcweb.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
public interface CourseDao extends JpaRepository<Course, Serializable> {
    Course findByNowCourse(String nowCourse);
}