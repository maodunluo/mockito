package com.cattle.mockito.service;

import com.cattle.mockito.dao.StudentDao;
import com.cattle.mockito.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yuechao
 */
@Component
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentDao studentDao;

    @Override
    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }
}
