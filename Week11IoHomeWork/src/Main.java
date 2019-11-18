package src;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Athlete> athletes = SkiBiathlon.readAthletesFromCSV("athletes.csv");
        for (Athlete a : athletes) {
            System.out.println(a);
        }
    }
}
