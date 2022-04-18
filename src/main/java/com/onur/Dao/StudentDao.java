package com.onur.Dao;

import com.onur.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void deleteStudent(int id);

    void addStudent(Student student);

    void updateStudent(Student student);
}
