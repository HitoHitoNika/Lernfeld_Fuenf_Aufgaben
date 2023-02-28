package EinfacheDatentypen.Ratespiel;

import java.util.Random;
import java.util.Scanner;

public class Ratespiel {
    /*
     * Auftrag: „Das erste Java-Spiel!“
     * Entwickeln Sie ein imperatives Programm für ein einfaches Spiel zum Erraten
     * einer Zahl.
     * Man soll auf spielerische Art und Weise eine zuvor zufällig erzeugte
     * Zufallszahl erraten.
     * Mehrmaliges raten, bis die Zahl getroffen wurde ist erlaubt.
     * Als Rückmeldung bekommt der Spieler die Nachricht, ob die Zahl getroffen
     * wurde, oder ob die getippte Zahl
     * kleiner oder größer als die gesuchte Zufallszahl ist.
     * 
     */

    public static void main(String[] args) {

        int eingabe;

        int randomZahl;

        Scanner scanner = new Scanner(System.in);

        boolean gewonnen = false;

        System.out.println("Willkommen beim Ratespiel");

        randomZahl = new Random().nextInt(grenzeBestimmen(scanner));

        while (gewonnen == false) {

            eingabe = nutzerEingabe(scanner);

            if (eingabe == randomZahl) {

                gewonnen = true;

                System.out.println("Sie haben gewonnen !");

            } else if (eingabe > randomZahl) {

                System.out.println("Die von ihnen eingegebene Zahl ist groesser als die Zufallszahl");

            } else if (eingabe < randomZahl) {

                System.out.println("Die von ihnen eingegebene Zahl ist kleiner als die Zufallszahl");

            }
        }
    }

    private static int nutzerEingabe(Scanner scanner) {
        System.out.println("Geben sie eine Zahl ein");
        return scanner.nextInt();
    }

    private static int grenzeBestimmen(Scanner scanner) {
        System.out.println("Bestimmen sie die obere Grenze der Zufallszahl");
        return scanner.nextInt();
    }
}
