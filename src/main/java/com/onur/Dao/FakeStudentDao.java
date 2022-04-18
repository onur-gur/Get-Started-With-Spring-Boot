package com.onur.Dao;

import com.onur.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakeData")
public class FakeStudentDao implements StudentDao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Onur", "Computer Science"));
                put(2, new Student(2, "Ali", "Maths"));
                put(3, new Student(3, "Kerem", "Social Media"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id) {
        return this.students.get(id);
    }

    @Override
    public void deleteStudent(int id) {
        this.students.remove(id);
    }

    @Override
    public void addStudent(Student student) {
        this.students.put(student.getId(), student);
    }

    @Override
    public void updateStudent(Student student) {
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(s.getId(), student);
    }
}
