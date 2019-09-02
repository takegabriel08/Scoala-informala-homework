package ro.siit.bv04.ObjectContainerProject.Person;

public class PersonFactory {
    /**
     * Acest design mi-a fost sugerat anterior pentru proiectul cu Product Store
     * si mi-a placut foarte mult ideea asa ca m-am decis ca nu ar fi rau daca l-as folisi si aici.
     *
     *
     */

    public Person getPerson(String type, String name, int age){
        Person person;


        if (type.equals("Somer")){
            person = new Somer(name, age);
        }else if (type.equals("Student")){
            person = new Student(name, age);
        }else if (type.equals("Angajat")){
            person = new Angajat(name, age);
        }else return null;

        return person;
    }
}




//        switch (type) {
//            case "Somer":
//                person = new Somer(String "", int 0);
//                break;
//            case "Student":
//                person = new Student();
//                break;
//            case "Angajat":
//                person = new Angajat();
//                break;
//            default:
//                return null;
//        }