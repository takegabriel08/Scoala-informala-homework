package exceptionsHomework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Am considerat ca este necesar sa creez o clasa de tipul container care sa extinda arraylist
 * deoarece am dorit sa adaug toate validarile in functiile listei,
 * tot spre final am gasit alta varianta de validari, introducandule in constructorul clasei Student,
 * cu toate ca nu sunt sigur daca ar fi cea mai buna alegere
 */

public class StudentContainer extends ArrayList {
    private List<Student> repository = new ArrayList<>();

    public List<Student> getSortedRepository() {
        return sortedRepository;
    }

    private List<Student> sortedRepository = new ArrayList<>();

    public List<Student> getRepository() {
        return repository;
    }

    public void addStudentToList(Student s) throws ValidationException {

        if (repository.contains(s) || s.getID() <= 0) {
            throw new ValidationException("Student is already in list or id < 0");
        } else {
            repository.add(s);
        }
    }

    public void deleteStudent(int id) {
        for (Student student : repository) {
            if (id == student.getID()) {
                repository.remove(student);
            }
        }
    }

    public void retrieveStudentByAge(int age) {
        repository.forEach(student -> {
            if (ExceptionsDate.calculateAge(student.getDateOfBirth()) == age) {
                System.out.println(student.toString());
            }
        });
    }

public void orderRepoByBirthDate(){
        sortedRepository = this.repository.stream().sorted(Comparator.comparing(Student::getDateOfBirth)).collect(Collectors.toList());
        sortedRepository.forEach(System.out::println);
}

//    public void orderRepository(){
////        sortedRepository = this.repository.stream().sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
////        sortedRepository.forEach(System.out::println);
////    }

    public void orderRepoByFirstName(){
        this.repository.stream().sorted(Comparator.comparing(Student::getFirstName)).forEach(System.out::println);
    }

    public void orderRepoByLastName(){
        this.repository.stream().sorted(Comparator.comparing(Student::getLastName)).forEach(System.out::println);
    }

//    public boolean validateInputs(String firstName, String lastName, LocalDate dateOfBirth, String gender, int id) throws ValidationException{
//        if (firstName.isEmpty() || lastName.isEmpty() || !dateOfBirth.equals(null) || gender.isEmpty() || id <= 0){
//
//                throw new ValidationException("All fields in Student are mandatory.");
//
//        }else return true;
//    }


}
