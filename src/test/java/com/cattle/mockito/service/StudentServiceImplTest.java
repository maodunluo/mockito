package com.cattle.mockito.service;

import com.cattle.mockito.dao.StudentDao;
import com.cattle.mockito.domain.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceImplTest {

    @Autowired
    StudentService studentService;

    @MockBean
    StudentDao studentDao;

    @BeforeEach
    void setUp() {
        Mockito.when(studentDao.getStudentById(1)).thenReturn(new Student(1, 18, "cattle"));
    }

    @Test
    void getStudentById() {
        Student studentById = studentService.getStudentById(1);
        assertNotNull(studentById);
        assertEquals(10, studentById.getAge());
        assertEquals("Tony", studentById.getName());
    }
}