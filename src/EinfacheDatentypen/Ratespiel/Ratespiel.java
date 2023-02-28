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

        int zugAnzahl=1;

        Scanner scanner = new Scanner(System.in);

        boolean gewonnen = false;

        System.out.println("Willkommen beim Ratespiel");

        randomZahl = new Random().nextInt(grenzeBestimmen(scanner))+1;


        while (gewonnen == false) {

            eingabe = nutzerEingabe(scanner);

            if (eingabe == randomZahl) {

                gewonnen = true;

                System.out.println("Sie haben gewonnen !");

                zugAnzahlAuswerten(zugAnzahl);

            } else if (eingabe > randomZahl) {

                System.out.println("Die von ihnen eingegebene Zahl ist groesser als die Zufallszahl");

            } else if (eingabe < randomZahl) {

                System.out.println("Die von ihnen eingegebene Zahl ist kleiner als die Zufallszahl");

            } 

            zugAnzahl++;

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

    private static void zugAnzahlAuswerten(int zugAnzahl){
        if(zugAnzahl<=5){
            System.out.println("Richtig flotter Hase hier in "+zugAnzahl+" Zuegen geloest");
        }else if(zugAnzahl<=10){
            System.out.println("Nicht ganz so flotter Hase in "+zugAnzahl+" Zuegen geloest");
        }else{
            System.out.println("Schildkröte in "+zugAnzahl+" Zuegen geloest");
        }
    }
    
    

}
