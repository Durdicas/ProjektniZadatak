package geometrijadrugi;

public abstract class GeometrijskiLik {
    private String naziv;

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public abstract double izracunajPovrsinu();
    public abstract double izracunajOpseg();
}
