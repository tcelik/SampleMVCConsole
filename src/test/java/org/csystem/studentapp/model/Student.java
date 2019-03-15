package org.csystem.studentapp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Student {
    private int m_id;
    private String m_name;
    private LocalDate m_birthDate;

    public Student(String name, LocalDate birthDate)
    {
        this(0, name, birthDate);
    }

    public Student(int id, String name, LocalDate birthDate)
    {
        m_id = id;
        m_name = name;
        m_birthDate = birthDate;
    }

    public int getId()
    {
        return m_id;
    }

    public void setId(int id)
    {
        m_id = id;
    }

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public LocalDate getBirthDate()
    {
        return m_birthDate;
    }

    public void setBirthDate(LocalDate birthDate)
    {
        m_birthDate = birthDate;
    }

    public double getAge() //each student age
    {
        return ChronoUnit.DAYS.between(m_birthDate, LocalDate.now()) / 365.;
    }

    @Override
    public String toString()
    {
        return String.format("%s:%.2f", m_name, this.getAge());
    }
}
