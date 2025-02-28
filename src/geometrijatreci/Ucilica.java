package geometrijatreci;

import geometrijatreci.GeometrijskiLik;
import geometrijatreci.Krug;
import geometrijatreci.Pravokutnik;
import geometrijatreci.Trokut;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ucilica {
    private List<GeometrijskiLik> likovi = new ArrayList<>();

    public void dodajLik(GeometrijskiLik lik) {
        likovi.add(lik);
    }

    public void ispisLikova() {
        for (GeometrijskiLik lik : likovi) {
            System.out.println(lik.getNaziv() + " - Površina: " + lik.izracunajPovrsinu() + ", Opseg: " + lik.izracunajOpseg());
        }
    }

    public void sortirajLikove() {
        Collections.sort(likovi);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ucilica ucilica = new Ucilica();

        while (true) {
            System.out.println("Odaberite geometrijski lik (Trokut, Krug, Pravokutnik) ili 'kraj' za završetak:");
            String izbor = scanner.nextLine().toLowerCase();
            if (izbor.equals("kraj")) {
                break;
            }

            switch (izbor) {
                case "trokut":
                    System.out.println("Unesite tri stranice trokuta: ");
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    double c = scanner.nextDouble();
                    scanner.nextLine(); // Čistimo ulaz
                    Trokut trokut = new Trokut(a, b, c);
                    ucilica.dodajLik(trokut);
                    break;
                case "krug":
                    System.out.println("Unesite radijus kruga: ");
                    double radijus = scanner.nextDouble();
                    scanner.nextLine(); // Čistimo ulaz
                    Krug krug = new Krug(radijus);
                    ucilica.dodajLik(krug);
                    break;
                case "pravokutnik":
                    System.out.println("Unesite širinu i visinu pravokutnika: ");
                    double sirina = scanner.nextDouble();
                    double visina = scanner.nextDouble();
                    scanner.nextLine(); // Čistimo ulaz
                    Pravokutnik pravokutnik = new Pravokutnik(sirina, visina);
                    ucilica.dodajLik(pravokutnik);
                    break;
                default:
                    System.out.println("Nevažeći unos! Molimo pokušajte ponovno.");
            }
        }

        // Ispis svih geometrijskih likova
        System.out.println("Ispis svih geometrijskih likova:");
        ucilica.ispisLikova();

        // Sortiranje likova
        ucilica.sortirajLikove();
        System.out.println("Sortirani likovi prema površini:");
        ucilica.ispisLikova();

        scanner.close();
    }
}