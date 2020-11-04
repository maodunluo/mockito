package com.cattle.mockito.dao;

import com.cattle.mockito.domain.Student;
import org.springframework.stereotype.Component;

/**
 * @author yuechao
 */
@Component
public class StudentDaoImpl implements StudentDao{

    @Override
    public Student getStudentById(int id) {
        return new Student(1, 10, "Tony");
    }
}
