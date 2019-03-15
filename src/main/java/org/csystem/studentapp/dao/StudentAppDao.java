package org.csystem.studentapp.dao;

import org.csystem.studentapp.model.Student;

import java.util.ArrayList;
import java.util.List;

// Data'ya ulaşmamızı sağlayan nesne(singleton olucak ve bir veritabanı oluşak- static)
// Data Access Object, Data Ulaşım Nesneleri

public class StudentAppDao {

    //Veritabanımız runtime oluşan bir collection
    private static ArrayList<Student> ms_students = new ArrayList<>();

    public boolean insertStudent(Student s)
    {
        return ms_students.add(s);
    }

    public List<Student> getStudents()
    {
        // lütfen clone dönünüz.
        return (ArrayList<Student>) ms_students.clone();
    }
}
