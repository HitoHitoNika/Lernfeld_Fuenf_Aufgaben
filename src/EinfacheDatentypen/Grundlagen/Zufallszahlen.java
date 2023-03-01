package EinfacheDatentypen.Grundlagen;

import java.util.Random;

/**
 * Zufallszahlen
 * 
 * @autor Max B / github.com/hitohitonika
 * @version 1.3
 * @datum 1.03.2023
 */

public class Zufallszahlen {
    public static void main(String[] args) {
        // Zufallszahl erzeugen

        int zufallsZahl = new Random().nextInt();

        System.out.println(zufallsZahl);

        // Zufallszahl von 0 bis m erzeugen im halboffenen Intervall [0, ...., m)

        int m = 100; // m ist die obere Grenze (exklusiv)

        int zufallsZahl2 = new Random().nextInt(m);

        System.out.println(zufallsZahl2);

        // Zufallszahl von n bis m erzeugen im geschlossenen Intervall [n,....,m]

        int n = 10; // n ist die untere Grenze

        int zufallsZahl3 = new Random().nextInt(m - n + 1) + n;

        System.out.println(zufallsZahl3);
    }

    static void aufgabeEins() {
        // Aufgabe 1
        // Erzeuge Zufallszahl
        int zufallsZahl = new Random().nextInt();

        System.out.println(zufallsZahl);
    }

    static void aufgabeZwei() {
        // Aufgabe 2
        // Erzeuge eine Zufallszahl im Bereich 0 bis 200
        int m = 201; // m ist die obere Grenze (exklusiv)

        int zufallsZahl = new Random().nextInt(m);

        System.out.println(zufallsZahl);

    }

    static void aufgabeDrei() {
        // Aufgabe 3
        // Erzeuge eine Zufallszahl im Bereich von 75 bis 500
        int zufallsZahl = new Random().nextInt(426) + 75;

        System.out.println(zufallsZahl);

    }
}
