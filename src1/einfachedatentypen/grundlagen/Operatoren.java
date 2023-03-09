package einfachedatentypen.grundlagen;

/**
 * Operatoren
 * 
 * @autor Max B / github.com/hitohitonika
 * @version 1.3
 * @datum 1.03.2023
 */

public class Operatoren {
    public static void main(String[] args) {
        // Beispiele
        int a = 100;
        int b = 300;
        int c;
        // Addieren von zwei und abspeichern in c
        c = a + b;
        System.out.println("Summe = " + c);

        // Multiplikation und Differenz
        c = c * 2 - b;
        System.out.println("Das Doppelte von c minus 300 = " + c);
        aufgabeEins();
        aufgabeZwei();
        aufgabeDrei();
    }

    static void aufgabeEins() {
        // Aufgabe 1
        // Testen Sie die Grundrechenarten "+","-","*","/" mit
        // zwei in int gespeicherten Zahlen

        double zahlEins = 5;
        double zahlZwei = 10;
        double ergebniss;
        // Addition
        ergebniss = zahlEins + zahlZwei;
        System.out.println(zahlEins + "+" + zahlZwei + "=" + ergebniss);

        // Subtraktion
        ergebniss = zahlZwei - zahlEins;
        System.out.println(zahlZwei + "-" + zahlEins + "=" + ergebniss);

        // Multiplikation
        ergebniss = zahlEins * zahlZwei;
        System.out.println(zahlEins + "*" + zahlZwei + "=" + ergebniss);

        // Division
        ergebniss = zahlZwei / zahlEins;
        System.out.println(zahlZwei + "/" + zahlEins + "=" + ergebniss);

    }

    static void aufgabeZwei() {
        // Aufgabe 2
        // Was macht der Operator "%" ?

        // Modulo ( % ) dient zur Teilung mit Rest
        // Beispiel:
        int zahlZwei = 11;
        int zahlEins = 2;
        int ergebniss = zahlZwei % zahlEins;
        System.out.println("Der Rest von" + zahlZwei + "/" + zahlEins + "ergibt" + ergebniss);

    }

    static void aufgabeDrei() {
        // Aufgabe 3
        // Was bedeutet die Schreibweise:

        // a+=b bedeutet a=a+b

        // a-=b bedeutet a=a-b
    }
}
