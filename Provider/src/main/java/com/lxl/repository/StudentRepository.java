package com.lxl.repository;

import com.lxl.entity.Student;

import java.util.Collection;

/**
 * @Author: Bruce
 * @Date: 2021/3/31 15:46
 * @Description:
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
