package geometrijadrugi;

public class Trokut extends GeometrijskiLik {
    private double a;
    private double b;
    private double c;

    public Trokut(double a, double b, double c) {
        super("Trokut");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double izracunajPovrsinu() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double izracunajOpseg() {
        return a + b + c;
    }
}
