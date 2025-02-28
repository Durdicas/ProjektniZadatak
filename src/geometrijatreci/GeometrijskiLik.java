package geometrijatreci;

public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik> {
    private String naziv;

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public abstract double izracunajPovrsinu();
    public abstract double izracunajOpseg();

    @Override
    public int compareTo(GeometrijskiLik drugi) {
        return Double.compare(this.izracunajPovrsinu(), drugi.izracunajPovrsinu());
    }
}
