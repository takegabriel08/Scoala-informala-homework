package exceptionsHomework;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;

/**
 * Am creat aceasta clasa deoarece am dorit sa am clasa student cu
 * atributul dateOfBirth de tipul localDate.
 * Si aceasta clasa contine functiile care impreuna creeaza un local date,
 * stiu ca prbabil ar fii fost mult mai eficient sa ii dau lui student
 * in loc de dateOfBirth treint-uri, day, month, year dar am realizat acest lucru spre finalul temei.
 */

public class ExceptionsDate {

    public static int calculateAge(LocalDate birthDate) {
        if (birthDate != null) {
            return Period.between(birthDate, LocalDate.now()).getYears();
        } else {
            return 0;
        }
    }

    public static LocalDate createBirthDate(int year, int month, int day){
        try{
//            dateOfBirth.getYear() < 1900 || dateOfBirth.getYear() > now.getYear()
            if (year < 1900 || year > LocalDate.now().minusYears(18).getYear()){
                throw new ValidationException("Invalid year.");
            }
            LocalDate localDate = LocalDate.of(year, month, day);
            return localDate;
        }catch(DateTimeException | ValidationException e){
            System.err.println(e.getMessage());
            return null;
        }
    }


    @Override
    public String toString() {
        return "ExceptionsDate" + " " + "{}";
    }
}
