package Adress;
/**
 *  Am creeat clasa adresa care contine tara judet oras
 *  pentru adresele hobby-urilor persoanelor.
 *
 */

public class Adresa {
    private String tara;
    private  String judet;
    private String oras;

    public Adresa(String tara, String judet, String oras) {
        this.tara = tara;
        this.judet = judet;
        this.oras = oras;
    }

    public String getTara() {
        return tara;
    }

    public String getJudet() {
        return judet;
    }

    public String getOras() {
        return oras;
    }
}
