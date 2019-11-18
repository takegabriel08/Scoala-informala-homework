package exceptionsHomework;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class Main {
    public static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws javax.xml.bind.ValidationException {
        Handler fileHandler = null;
        logger.info("Logger name: " + logger.getName());

        logger.log(Level.ALL, "Start app!");

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        ExceptionsDate birthDate = new ExceptionsDate();
        System.out.println(date.format(formatter));
        StudentContainer st = new StudentContainer();


        try {
            fileHandler = new FileHandler("./ExceptionsHomework.log");
            logger.addHandler(fileHandler);

            fileHandler.setLevel(Level.ALL);
            logger.setLevel(Level.ALL);

            logger.config("Logger configuration done!");

            st.addStudentToList(new Student("Gabriel", "tache", LocalDate.of(1986, 6, 29), "m", 2));
            st.addStudentToList(new Student("radu", "tache", LocalDate.of(1992, 12, 10), "M", 1));
            st.addStudentToList(new Student("Andreea", "Apetri", LocalDate.of(1992, 6, 7), "F", 3));
            st.addStudentToList(new Student("Andreea", "Belciug", LocalDate.of(1991, 1, 28), "F", 4));
            st.addStudentToList(new Student("Cabao", "Gigelescu", LocalDate.of(2001, 1, 28), "F", 5));
            st.addStudentToList(new Student("Aaandreea", "ZBelciug", LocalDate.of(1965, 1, 28), "F", 6));


            System.out.println("Retriving students by age.");
            st.retrieveStudentByAge(26);

            System.out.println("|=======================-----=====================|");

            System.out.println("Order repo by first name");
            st.orderRepoByFirstName();

            System.out.println("|=======================-----=====================|");

            System.out.println("Order repo by last name");
            st.orderRepoByLastName();

            System.out.println("|=======================-----=====================|");

            System.out.println("Order repo by birthday");
            st.orderRepoByBirthDate();

            System.out.println("=======================-----========================");


        } catch (ValidationException e) {
            e.printStackTrace();
            logger.log(Level.SEVERE, "Invalid birthday input", e);
        } catch (NameException e) {
            e.printStackTrace();
            logger.log(Level.SEVERE, "Name cannot be empty", e);
        } catch (GenderException e) {
            e.printStackTrace();
            logger.log(Level.SEVERE, "Gender can be only M or F", e);
        } catch (IdException e) {
            e.printStackTrace();
            logger.log(Level.SEVERE, "ID must be bigger than zero!", e);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", e);
        }

    }

}
