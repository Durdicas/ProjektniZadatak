package geometrija;

public class Krug {
    private String naziv;
    private double radijus;

    public Krug(double radijus) {
        this.naziv = "Krug";
        this.radijus = radijus;
    }

    public double izracunajPovrsinu() {
        return Math.PI * radijus * radijus;
    }

    public double izracunajOpseg() {
        return 2 * Math.PI * radijus;
    }

    public String getNaziv() {
        return naziv;
    }
}
