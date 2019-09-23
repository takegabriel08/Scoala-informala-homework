package exceptionsHomework;

import javax.xml.bind.ValidationException;
import java.time.LocalDate;
import java.util.Objects;

public class Student {
    //- First Name
    private String firstName;
    //- Last Name
    private String lastName;
    //- Date of Birth
    private LocalDate dateOfBirth;
    //- Gender
    private String gender;
    //- ID (CNP)
    private int ID;


    public Student(String firstName, String lastName, LocalDate dateOfBirth, String gender, int ID) throws ValidationException, NameException, GenderException,IdException {
        LocalDate now = LocalDate.now();

        if (dateOfBirth.getYear() < 1900 || dateOfBirth.getYear() > now.getYear()) {
            throw new ValidationException("Year is not valid");
        } else {
            this.dateOfBirth = dateOfBirth;
        }
        if (firstName.isEmpty() || lastName.isEmpty()) {
            throw new NameException("First name and Last name can't be empty");
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        if (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f")) {
            this.gender = gender;
        } else {
            throw new GenderException("Gender should only be m or f!");
        }
        if (ID <= 0) {
            throw new IdException("Invalid id");
        }else {
            this.ID = ID;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public long getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", " + "Student name: " + firstName + " " + lastName + ", " +
                "Gender: " + gender + ", " + "Date of birth: " + dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ID == student.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
