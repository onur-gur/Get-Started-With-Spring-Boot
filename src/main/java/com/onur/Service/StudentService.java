package com.onur.Service;

import com.onur.Dao.FakeStudentDao;
import com.onur.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("fakeData")
    private FakeStudentDao fakeStudentDao;

    public Collection<Student> getAllStudents(){
        return fakeStudentDao.getAllStudents();
    }

    public Student getStudentById(int id){
        return  fakeStudentDao.getStudentById(id);
    }

    public void deleteStudent(int id) {
        fakeStudentDao.deleteStudent(id);
    }

    public void addStudent(Student student) {
        fakeStudentDao.addStudent(student);
    }

    public void updateStudent(Student student) {
        fakeStudentDao.updateStudent(student);
    }
}
