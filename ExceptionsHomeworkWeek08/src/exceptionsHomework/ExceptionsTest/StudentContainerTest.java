package exceptionsHomework.ExceptionsTest;

import exceptionsHomework.*;
import org.junit.Test;

import javax.xml.bind.ValidationException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class StudentContainerTest {

    StudentContainer studentContainer = new StudentContainer();

    @Test
    public void addStudentToListTest() throws ValidationException, GenderException, IdException, NameException, exceptionsHomework.ValidationException {
        // input
        LocalDate birthdate = ExceptionsDate.createBirthDate(1991, 6, 29);
        studentContainer.addStudentToList(new Student("radu", "tache", birthdate, "M", 1));
        // output
        List<Student> list = new ArrayList<>();
        list.add(new Student("radu", "tache", birthdate, "M", 1));
        //assert
        assertEquals(studentContainer.getRepository(), list);
    }

    @Test
    public void deleteStudentTest() throws ValidationException, GenderException, IdException, NameException, exceptionsHomework.ValidationException {
        //input
        LocalDate birthdate = ExceptionsDate.createBirthDate(1991, 6, 29);
        studentContainer.addStudentToList(new Student("radu", "tache", birthdate, "M", 1));
        studentContainer.addStudentToList(new Student("radu", "tache", birthdate, "M", 2));
        studentContainer.deleteStudent(1);
        //output
        List<Student> list = new ArrayList<>();
        list.add(new Student("radu", "tache", birthdate, "M", 2));
        //assert
        assertEquals(studentContainer.getRepository(), list);
    }

}
