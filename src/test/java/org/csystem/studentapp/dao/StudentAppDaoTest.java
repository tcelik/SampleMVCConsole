package org.csystem.studentapp.dao;

import org.csystem.studentapp.model.Student;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Data'ya ulaşmamızı sağlayan nesne(singleton olucak ve bir veritabanı oluşak- static)
// Data Access Object, Data Ulaşım Nesneleri

public class StudentAppDaoTest {

    @Test
    public void insertStudentTest()
    {
        StudentAppDao dao = new StudentAppDao();

        dao.insertStudent(new Student(0, "tugberk", LocalDate.of(1994, 05, 23)));

        assertEquals("tugberk", dao.getStudents().get(0).getName(), "ok");
    }


    @Test
    public void insertStudentTest1()
    {
        StudentAppDao dao = new StudentAppDao();

        dao.insertStudent(new Student(0, "tugberk", LocalDate.of(1994, 05, 23)));

        assertEquals("tugberk", dao.getStudents().get(0).getName(), "ok");
    }
}
