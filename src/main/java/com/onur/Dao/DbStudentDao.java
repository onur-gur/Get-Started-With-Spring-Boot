package com.onur.Dao;

import com.onur.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("dbData")
public class DbStudentDao implements StudentDao {

    Connection dbConnection;

    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>() {
            {
                add(new Student(1,"Susan","Machine Learning"));
                add(new Student(2,"Sarah","Java SE"));
                add(new Student(3,"Katherine","Java EE"));

            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void deleteStudent(int id) {

    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void updateStudent(Student student) {

    }
}
