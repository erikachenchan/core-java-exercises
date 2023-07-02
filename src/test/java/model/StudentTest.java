package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sortGrade.model.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    public Student student;

    @BeforeEach
    public void setUp() throws Exception {
        student = new Student(1, "erika", 60, 59, 95);
        student.setUserId(1);
        student.setName("jeff");
        student.setEnglishGrade(50);
        student.setMathGrade(50);
        student.setScienceGrade(50);
    }

    @Test
    void getUserObject() throws Exception {
        assertEquals(1, student.getUserId());
        assertEquals("jeff", student.getName());
        assertEquals(50.0, student.getEnglishGrade());
        assertEquals(50.0, student.getMathGrade());
        assertEquals(50.0, student.getScienceGrade());
    }
}
