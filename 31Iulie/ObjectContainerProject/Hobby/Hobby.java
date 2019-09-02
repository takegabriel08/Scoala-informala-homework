package Hobby;

import Adress.Adresa;


import java.util.List;

/**
 * Clasa hobby cu proprietatile nume frecventa si lista de adrese unde poate fii facut hobbyul
 */
public class Hobby{
    public String name;
    public int frequency;
    public List<Adresa> hobbyAdress;

    public Hobby(String name, int frequency, List<Adresa> hobbyAdress) {
        this.name = name;
        this.frequency = frequency;
        this.hobbyAdress = hobbyAdress;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<Adresa> getHobbyAdress() {
        return hobbyAdress;
    }
}
