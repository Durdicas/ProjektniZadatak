package geometrija;

public class Pravokutnik {
    private String naziv;
    private double sirina, visina;

    public Pravokutnik(double sirina, double visina) {
        this.naziv = "Pravokutnik";
        this.sirina = sirina;
        this.visina = visina;
    }

    public double izracunajPovrsinu() {
        return sirina * visina;
    }

    public double izracunajOpseg() {
        return 2 * (sirina + visina);
    }

    public String getNaziv() {
        return naziv;
    }
}