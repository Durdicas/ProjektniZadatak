package app;

import geometrija.Krug;
import geometrija.Pravokutnik;
import geometrija.Trokut;

import java.util.Scanner;

// Projektni zadatak
/*
Dobili ste projektni zadatak razviti konzolnu aplikaciju „Učilica”.
Cilj te aplikacije je pomoći učenicima osnovne škole da lakše savladaju neke značajke osnovnih
geometrijskih likova. Geometrijski likovi koje ćemo pokriti su: Trokut, Krug i Pravokutnik.
        Trokut je definiran s 3 stranice
        Krug je definiran radijusom.
        Pravokutnik je definiran s 2 stranice.
Svaki geometrijski lik ima svoj Naziv, i možemo mu izračunati Površinu i Opseg.
Aplikacija mora omogućiti unos novog geometrijskog lika.
Aplikacija mora moći ispisati sve površine i opsege kreiranih geometrijskih likova.
Aplikacija mora moći sortirati sve kreirane geometrijske likove po površini uzlazno.

ZADATAK 1 - 12.2.2025: Na osnovu opisa projektnog zadatka, pripremite i implementirajte potrebne
klase za trokut, krug i pravokutnik.  8:29 PM

ZADATAK 2: Pripremite neke elemente u klasama koje se ponavljaju.
Implementirajte baznu klasu GeometrijskiLik, te refaktorirajte klase Pravokutnik, Trokut i Krug na način
da odgovaraju specifikaciji zadatka.

ZADATAK 3: Omogućite sortiranje geometrijskih likova prema specifikaciji (po površini uzlazno).
Implementirajte novu klasu Ucilica, koja će sadržavati kolekciju generiranih geometrijskih likova.
Demonstrirajte sve funkcionalnosti.
 */
// Za sada samo 1. zadatak cjelokupnog projekta

// Glavna klasa za unos podataka od korisnika
public class Main {
    public static void main(String[] args) {
        // Prethodna verzija koju komentiram jer korisnik mora sam unijeti veličine
        /*
        Trokut trokut = new Trokut(3, 4, 5);
        Krug krug = new Krug(5);
        Pravokutnik pravokutnik = new Pravokutnik(4, 6);

        System.out.println(trokut.getNaziv() + " - Površina: " + trokut.izracunajPovrsinu() + ", Opseg: " + trokut.izracunajOpseg());
        System.out.println(krug.getNaziv() + " - Površina: " + krug.izracunajPovrsinu() + ", Opseg: " + krug.izracunajOpseg());
        System.out.println(pravokutnik.getNaziv() + " - Površina: " + pravokutnik.izracunajPovrsinu() + ", Opseg: " + pravokutnik.izracunajOpseg());
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Odaberite geometrijski lik (Trokut, Krug, Pravokutnik): ");
        String izbor = scanner.nextLine().toLowerCase();

        switch (izbor) {
            case "trokut":
                System.out.println("Unesite tri stranice trokuta: ");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                Trokut trokut = new Trokut(a, b, c);
                System.out.println(trokut.getNaziv() + " - Površina: " + trokut.izracunajPovrsinu() + ", Opseg: " + trokut.izracunajOpseg());
                break;
            case "krug":
                System.out.println("Unesite radijus kruga: ");
                double radijus = scanner.nextDouble();
                Krug krug = new Krug(radijus);
                System.out.println(krug.getNaziv() + " - Površina: " + krug.izracunajPovrsinu() + ", Opseg: " + krug.izracunajOpseg());
                break;
            case "pravokutnik":
                System.out.println("Unesite širinu i visinu pravokutnika: ");
                double sirina = scanner.nextDouble();
                double visina = scanner.nextDouble();
                Pravokutnik pravokutnik = new Pravokutnik(sirina, visina);
                System.out.println(pravokutnik.getNaziv() + " - Površina: " + pravokutnik.izracunajPovrsinu() + ", Opseg: " + pravokutnik.izracunajOpseg());
                break;
            default:
                System.out.println("Nevažeći unos! Molimo pokušajte ponovno.");
        }

        scanner.close();

    }
}

