package exceptionsHomework.ExceptionsTest;

import exceptionsHomework.ExceptionsDate;
import org.junit.Test;


import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

/**
 * Aici am testat functiile create in clasa Exceptions Date
 * Imi cer scuze pentru numele neinspirate ale claselor
 */
public class ExceptionDateTest {

    @Test
    public void createBirthDateTest(){
        //1. Date intrare, adica ce imi returneaza functia mea
        LocalDate localDate = ExceptionsDate.createBirthDate(-1, 06, 29);
        //2. Output, datele de iesire
        LocalDate expectedOutput = LocalDate.of(-1, 06, 29);
        //3. Assert
        assertEquals(expectedOutput, localDate);
    }

    @Test
    public void calculateAgeTest() {
        // dateintrare
        LocalDate birthDate =  ExceptionsDate.createBirthDate(1991, 06, 29);
        int input = ExceptionsDate.calculateAge(birthDate);
        // output
        int output = 28;
        //assert
        assertEquals(input,output);
    }
}
