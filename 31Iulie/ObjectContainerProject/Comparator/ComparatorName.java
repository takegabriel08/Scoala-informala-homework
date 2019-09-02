package Comparator;

import ro.siit.bv04.ObjectContainerProject.Person.Person;

import java.util.Comparator;

public class ComparatorName implements Comparator<Person> {
    /**
     * Comparator pe baza de nume
     * @param o1
     * @param o2
     * @return
     */

    @Override
    public int compare(Person o1, Person o2) {
        String firstName;
        String secondName;
        firstName = o1.getName();
        secondName = o2.getName();

        return firstName.compareTo(secondName);
    }
}
