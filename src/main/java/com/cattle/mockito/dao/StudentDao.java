package com.cattle.mockito.dao;

import com.cattle.mockito.domain.Student;

/**
 * @author yuechao
 */
public interface StudentDao {
    /**
     * 通过主键得到student对象
     *
     * @param id 主键
     * @return Student对象
     */
    Student getStudentById(int id);
}
