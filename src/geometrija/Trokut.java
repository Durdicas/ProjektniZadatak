package geometrija;
//import java.util.Scanner;

public class Trokut {
    private String naziv;
    private double a, b, c;

    public Trokut(double a, double b, double c) {
        this.naziv = "Trokut";
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double izracunajPovrsinu() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double izracunajOpseg() {
        return a + b + c;
    }

    public String getNaziv() {
        return naziv;
    }
}