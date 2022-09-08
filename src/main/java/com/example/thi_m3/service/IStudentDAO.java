package com.example.thi_m3.service;
import com.example.thi_m3.model.Student;

import java.util.List;
public interface IStudentDAO {
    public List<Student> findAll();

    public List<Student> findByName(String name);

    public void save(Student student);

    public void edit (int id, Student student);

    public void delete (Student student);

    void delete(int id);

    Student findByID(int id);
}
