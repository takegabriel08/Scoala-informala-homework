

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SkiBiathlon {
    public static List<Athlete> readAthletesFromCSV(String fileName) {
        List<Athlete> athletes = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {

            String line = br.readLine();

            while (line != null) {

                String[] attributes = line.split(",");

                Athlete athlete = createAthlete(attributes);

                athletes.add(athlete);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return athletes;
    }

    private static Athlete createAthlete(String[] metadata) {

        int athleteNumber = Integer.parseInt(metadata[0]);
        String athleteName = metadata[1];
        String countryCode = metadata[2];
        String skiTimeResult = metadata[3];
        String firstShootingRange = metadata[4];
        String secondShootingRange = metadata[5];
        String thirdShootingRange = metadata[6];


        return new Athlete(athleteNumber, athleteName, countryCode, skiTimeResult, firstShootingRange, secondShootingRange, thirdShootingRange );
    }

}
