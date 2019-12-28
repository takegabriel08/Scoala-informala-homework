package TUDOR;

import java.time.LocalTime;

public class Athlete implements Comparable<Athlete> {
    private int athleteNumber;
    private String Name;
    private String countryCode;
    private LocalTime athleteTime;
    private String shoot1;
    private String shoot2;
    private String shoot3;



    public Athlete(int athleteNumber, String name, String countryCode, LocalTime athleteTime, String shoot1, String shoot2, String shoot3) {
        this.athleteNumber = athleteNumber;
        Name = name;
        this.countryCode = countryCode;
        this.athleteTime = athleteTime;
        this.shoot1 = shoot1;
        this.shoot2 = shoot2;
        this.shoot3 = shoot3;
    }

    public int getAthleteNumber() {
        return athleteNumber;
    }

    public void setAthleteNumber(int athleteNumber) {
        this.athleteNumber = athleteNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public LocalTime getAthleteTime() {
        return athleteTime;
    }

    public void setAthleteTime(LocalTime athleteTime) {
        this.athleteTime = athleteTime;
    }

    public String getShoot1() {
        return shoot1;
    }

    public void setShoot1(String shoot1) {
        this.shoot1 = shoot1;
    }

    public String getShoot2() {
        return shoot2;
    }

    public void setShoot2(String shoot2) {
        this.shoot2 = shoot2;
    }

    public String getShoot3() {
        return shoot3;
    }

    public void setShoot3(String shoot3) {
        this.shoot3 = shoot3;
    }

    @Override
    public int compareTo(Athlete secondAthlete) {
        return this.getAthleteTime().compareTo(secondAthlete.getAthleteTime());
    }

    @Override
    public String toString() {
        return "Athlete " +
                " athleteNumber " + athleteNumber +
                ", Name '" + Name + '\'' +
                ", countryCode '" + countryCode + '\'' +
                ", athleteTime " + athleteTime +
                ", shoot1 ='" + shoot1 + '\'' +
                ", shoot2 ='" + shoot2 + '\'' +
                ", shoot3 ='" + shoot3 + '\'';
    }
}
