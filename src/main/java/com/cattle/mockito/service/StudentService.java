package com.cattle.mockito.service;

import com.cattle.mockito.domain.Student;

/**
 * @author yuechao
 */
public interface StudentService {
    /**
     * 通过主键得到学生对象
     *
     * @param id 主键
     * @return 学生对象
     */
    Student getStudentById(int id);
}
