package einfachedatentypen.grundlagen;

/**
 * Datentypen Darstellung
 * 
 * @autor Max B / github.com/hitohitonika
 * @version 1.3
 * @datum 1.03.2023
 */

public class Datentypen {
    public static void main(String[] args) {
        // Beispiele
        // Deklaration ("Speicherplatz reservieren")
        double temperatur;
        char zeichen;
        // Intialisierung ("Wert abspeichern")
        temperatur = 32.57;
        zeichen = '@';
        
        System.out.println(temperatur + "\n" + zeichen);

        // Deklaration und Initialisierung
        byte alter = 19;
        int grosseZahl = 1000000;
        float groesse = 1.66f;
        double kranHoehe = 73.7;
        boolean javaIstToll = true;

        System.out.println(alter + "\n" +  groesse + "\n" + grosseZahl 
        + "\n" +kranHoehe + "\n" +javaIstToll);

        aufgabeEins();
        aufgabeZwei();
        aufgabeDrei();
        
        
    }

    static void aufgabeEins() {
        // Aufgabe 1
        // Deklarieren Sie eine int-Variable und speichern Sie
        // die Zahl 129 darin ab. Speichern Sie in einer float-Variable
        // die Zahl 3,14 ab. Speichern Sie in einer double-Variable
        // die Zahl 1,618 ab.
        int zahl = 129;
        float gleitkommaZahl = 3.14f;
        double coolereGleitkommaZahl = 1618;

        System.out.println(zahl + "\n" + gleitkommaZahl + "\n" + coolereGleitkommaZahl);
    }

    static void aufgabeZwei() {
        // Aufgabe 2
        // Ihr Alter, ihre Körpergroesse, die Information ob etwas schwarz oder weiß ist
        // Das $ Zeichen, die Anzahl der Wochentage
        int meinAlter = 21;
        double meineGroesse = 2.01;
        boolean istSchwarz;
        istSchwarz = true;
        boolean istWeiss;
        istWeiss = false;
        char character = '$';
        int anzahlDerWochentage = 7;

        System.out.println(meinAlter + "\n" + meineGroesse + "\n" + meinAlter
        + "\n" + character + "\n" + anzahlDerWochentage);
        System.out.println (istSchwarz + "\n" + istWeiss );
    }


    static void aufgabeDrei() {
        // Aufgabe 3
        // Legen Sie für drei selbstgewählte Daten sinnvolle
        // Speicherplätze an und belegen Sie diese mit Werten.
        double kontostand = 10.25;
        float notenDurschnitt = 2.5f;
        char geschlecht = 'm';

        System.out.println(kontostand);
        System.out.println(notenDurschnitt);
        System.out.println(geschlecht);


    }
}