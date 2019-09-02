package ro.siit.bv04.ObjectContainerProject;


import ro.siit.bv04.ObjectContainerProject.Adress.Adresa;
import ro.siit.bv04.ObjectContainerProject.Comparator.ComparatorFactory;
import ro.siit.bv04.ObjectContainerProject.Hobby.Hobby;
import ro.siit.bv04.ObjectContainerProject.Person.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ComparatorFactory cf = new ComparatorFactory();
        PersonFactory pf = new PersonFactory();

        TreeSet<Person> peopleTreeSet = new TreeSet<Person>(cf.getComparator("Name"));

        peopleTreeSet.add(pf.getPerson("Angajat", "Batranul", 44));
        peopleTreeSet.add(new Somer("Mihai",18));
        peopleTreeSet.add(new Angajat("Andrei",19));
        peopleTreeSet.add(new Student("Ion",20));
        peopleTreeSet.add(new Somer("Mircea",17));
        peopleTreeSet.add(new Angajat("John",19));
        peopleTreeSet.add(new Student("Mohammed",33));
        peopleTreeSet.add(new Somer("Gheorghe",20));
        peopleTreeSet.add(new Angajat("Suzanna",16));
        peopleTreeSet.add(new Student("Codruta",22));
        peopleTreeSet.add(new Somer("Andreea",25));


        TreeSet<Person> peopleTreeSet2 = new TreeSet<Person>(cf.getComparator("Age"));
        peopleTreeSet2.add(new Somer("George", 22));
        peopleTreeSet2.add(new Angajat("Mihai", 23));
        peopleTreeSet2.add(new Student("Gabriel", 23));

        peopleTreeSet2.add(pf.getPerson("Angajat","unujmecher", 26));
        peopleTreeSet2.add(pf.getPerson("Somer","Micinas", 21));
        peopleTreeSet2.add(pf.getPerson("Student","Aurel", 23));
        peopleTreeSet2.add(pf.getPerson("Angajat","Gabriel", 22));
        peopleTreeSet2.add(pf.getPerson("Somer","Andrei", 25));
        peopleTreeSet2.add(pf.getPerson("Student","Ramona", 20));
        peopleTreeSet2.add(pf.getPerson("Angajat","Plavie", 29));
        peopleTreeSet2.add(pf.getPerson("Somer","Raluca", 22));
        peopleTreeSet2.add(pf.getPerson("Student","Angelica", 27));
        peopleTreeSet2.add(pf.getPerson("Angajat","Angela", 20));
        peopleTreeSet2.add(pf.getPerson("Somer","Mihaela", 12));


        List<Adresa> alergatAdresaList = new ArrayList<Adresa>();
        alergatAdresaList.add(new Adresa(" Albania ", " Prslawkoq ", " Borcan "));
        alergatAdresaList.add(new Adresa(" Macedonia ", " Borganskia ", " Chorbah "));
        alergatAdresaList.add(new Adresa(" Bulgaria ", " Ciobaka ", " Golden Sands "));
        alergatAdresaList.add(new Adresa(" Romania ", " Brasob ", " Brasov "));
        alergatAdresaList.add(new Adresa(" Italia ", " Sicilia ", " Messina "));

        List<Adresa> cataratAdressList = new ArrayList<Adresa>();
        cataratAdressList.add(new Adresa(" Romania ", " Brasov "," Predeal " ));
        cataratAdressList.add(new Adresa(" Romania ", " Brasov "," Rasnov " ));
        cataratAdressList.add(new Adresa(" Romania ", " Brasov "," Moeciu de Jos " ));
        cataratAdressList.add(new Adresa(" Romania ", " Brasov "," Moeciu de Sus " ));
        cataratAdressList.add(new Adresa(" Romania ", " Brasov "," Pietrele lui Solomon " ));

        List<Adresa> pescuitAdressList = new ArrayList<Adresa>();
        pescuitAdressList.add( new Adresa(" Romania ", " Dambovita ", " Lacul Dambovita Seaca "));
        pescuitAdressList.add( new Adresa(" Romania ", " Butimanu ", " Lacul Butimanu "));
        pescuitAdressList.add( new Adresa(" Romania ", " Prahova ", " Bordenii Mari Poiana "));


        List<Adresa> vanatAdressList = new ArrayList<Adresa>();
        vanatAdressList.add(new Adresa(" Romania ", " Dambovita ", " Padurea Negrea Bucsani "));
        vanatAdressList.add(new Adresa(" Romania ", " Dambovita ", " Parcul Natural DorraDalles "));
        vanatAdressList.add(new Adresa(" Romania ", " Dambovita ", " Padurea Habeni "));

        List<Adresa> gamingAdressList = new ArrayList<Adresa>();
        gamingAdressList.add(new Adresa(" Romania ", " Dambovita ", " Bucsani "));
        gamingAdressList.add(new Adresa(" Romania ", " Brasov ", " Srada Paraului "));
        gamingAdressList.add(new Adresa(" Romania ", " Brasov ", " Srada Ioan Popasu "));
        gamingAdressList.add(new Adresa(" Romania ", " Prahova ", " Breaza "));

        List<Hobby> hobbyList1 = new ArrayList<Hobby>();
        hobbyList1.add(new Hobby(" Pescuit ", 2, alergatAdresaList));
        hobbyList1.add(new Hobby(" Computer gaming  ", 20, alergatAdresaList));

        List<Hobby> hobbyList2 = new ArrayList<Hobby>();
        hobbyList2.add(new Hobby(" Alergat ", 3, alergatAdresaList));
        hobbyList2.add(new Hobby(" Vanat ", 4, alergatAdresaList));

        List<Hobby> hobbyList3 = new ArrayList<Hobby>();
        hobbyList3.add(new Hobby(" Catarat ", 5, alergatAdresaList));
        hobbyList3.add(new Hobby(" Alergat ", 3, alergatAdresaList));

        List<Hobby> raduHobbyList = new ArrayList<Hobby>();
        raduHobbyList.add(new Hobby(" Inot ", 3, pescuitAdressList));
        raduHobbyList.add(new Hobby(" Alergat ", 3, alergatAdresaList));


        List<Hobby> hobbyList = new ArrayList<Hobby>();
        hobbyList.add(new Hobby(" Alergat ", 3, alergatAdresaList));
        hobbyList.add(new Hobby(" Catarat ", 5, alergatAdresaList));
        hobbyList.add(new Hobby(" Pescuit ", 2, alergatAdresaList));
        hobbyList.add(new Hobby(" Vanat ", 4, alergatAdresaList));
        hobbyList.add(new Hobby(" Computer gaming  ", 20, alergatAdresaList));

        Map<Person, List<Hobby>> personMap = new HashMap<Person, List<Hobby>>();
        personMap.put(pf.getPerson("Somer", "Gabriel ", 28), hobbyList);
        personMap.put(pf.getPerson("Angajat", "Mirel ", 27), hobbyList2 );
        personMap.put(pf.getPerson("Student", "Claudiu ", 23), hobbyList1 );
        personMap.put(pf.getPerson("Angajat", " Radu ",  26), raduHobbyList);

        for (Map.Entry<Person, List<Hobby>> personObj: personMap.entrySet()) {
            System.out.print("Numele persoanei " + personObj.getKey().getName());
            System.out.print("Varsta " + personObj.getKey().getAge() + " de ani ");
            for (Hobby hobbyObj:personObj.getValue()) {
                System.out.print("Hobby " + hobbyObj.getName());
                System.out.println("Frecventa de " + hobbyObj.getFrequency() + " ori pe saptamana.");
                for (Adresa adressObj:hobbyObj.getHobbyAdress()) {
                    System.out.print("Tara " + adressObj.getTara());
                    System.out.print("Judet " + adressObj.getJudet());
                    System.out.println("Oras " + adressObj.getOras());
                }
            }
        }


//        for (Person person:peopleTreeSet2) {
//            System.out.println(person.getName());
//        }
//
//        System.out.println("\n");
//
//        for(Person person : peopleTreeSet) {
//            System.out.println(person.getName());
//        }
//        peopleTreeSet.forEach((p)->{
//            System.out.println(p.getName());
//        });

    }
}
