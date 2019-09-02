package Comparator;

import ro.siit.bv04.ObjectContainerProject.Person.Person;

import java.util.Comparator;

/**
 * comparator de obiecte de tipul Person compara obiectele in functie de variabila age
 */
public class ComparatorAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge() - o2.getAge() == 0) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return o1.getAge() - o2.getAge();
        }
    }
}
