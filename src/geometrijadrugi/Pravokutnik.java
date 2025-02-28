package geometrijadrugi;

public class Pravokutnik extends GeometrijskiLik {
    private double sirina;
    private double visina;

    public Pravokutnik(double sirina, double visina) {
        super("Pravokutnik");
        this.sirina = sirina;
        this.visina = visina;
    }

    @Override
    public double izracunajPovrsinu() {
        return sirina * visina;
    }

    @Override
    public double izracunajOpseg() {
        return 2 * (sirina + visina);
    }
}
