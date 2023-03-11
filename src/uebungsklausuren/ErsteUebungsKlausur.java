package uebungsklausuren;

import java.util.Random;

public class ErsteUebungsKlausur {

    // Sie sind als Auszubildender in der CBS GmbH. Sie werden beauftragt einen
    // kleinen Taschenrechner in Java zu programmieren

    public static void main(String[] args) {
        // Deklarieren und Initialisieren Sie für die Berechnung folgende Variablen

        // Drei Variablen für ganzzahlige Berechnungen
        int zahlEins;
        int zahlZwei;
        int ergebnisGanzZahl;
        // Drei Variablen für Berechnungen mit Kommazahlen
        double kommaZahlEins;
        double kommaZahlZwei;
        double kommaZahlErgebnis;
        // Zwei Variablen zum Speichern von Wahrheitswerten
        boolean wahrheitsWertEins;
        boolean wahrheitsWertZwei;

        // Berechnungen durchführen

        // Berechnen Sie die Summe und das Produkt von 523 und 114.
        // Nutzen Sie zum Speichern der Zahlen die ersten zwei angelegten (Ganzzahl-)
        // Variablen und speichern Sie das Ergebnis in der dritten Variable ab.
        zahlEins = 523;
        zahlZwei = 114;
        ergebnisGanzZahl = zahlEins + zahlEins;
        System.out.println(zahlEins + " + " + zahlZwei + " = " + ergebnisGanzZahl);
        ergebnisGanzZahl = zahlEins * zahlEins;
        System.out.println(zahlEins + " * " + zahlZwei + " = " + ergebnisGanzZahl);

        // Berechnen Sie die Summe und das Produkt von 2,75 und 7,2.
        // Nutzen Sie zum Speichern der Zahlen die ersten zwei angelegten (Kommazahl-)
        // Variablen und speichern Sie das Ergebnis in der dritten Variable ab.
        kommaZahlEins = 2.75;
        kommaZahlZwei = 7.2;
        kommaZahlErgebnis = kommaZahlEins + kommaZahlZwei;
        System.out.println(kommaZahlEins + " + " + kommaZahlZwei + " = " + kommaZahlErgebnis);
        kommaZahlErgebnis = kommaZahlEins * kommaZahlZwei;
        System.out.println(kommaZahlEins + " * " + kommaZahlZwei + " = " + kommaZahlErgebnis);

        // Schleifen

        // Addieren Sie in einer for-Schleife die Zahlen von 1 bis 100 auf (1+2+3+4+….).
        // (Setzen Sie Ihre Variable zum Speichern der Summe vor der Schleife wieder auf
        // 0.)

        ergebnisGanzZahl = 0;

        for (zahlEins = 0; zahlEins <= 100; zahlEins++) {
            ergebnisGanzZahl += zahlEins;
        }
        System.out.println("Die Zahlen 1-100 ergeben addiert " + ergebnisGanzZahl);

        // Addieren Sie in einer weiteren for-Schleife die nur die ganzen Zahlen
        // zwischen 1 und 100 auf (2+4+6+8+…).
        // (Setzen Sie Ihre Variable zum Speichern der Summe vor der Schleife wieder auf
        // 0.)

        ergebnisGanzZahl = 0;

        for (zahlEins = 0; zahlEins <= 100; zahlEins += 2) {
            ergebnisGanzZahl += zahlEins;
        }
        System.out.println("Die ganze Zahlen 2-100 ergeben addiert " + ergebnisGanzZahl);

        // Schleifen und Zufallszahlen

        // Erzeugen Sie eine Zufallszahl im Bereich von 0 bis 100. Testen Sie, ob die
        // Zufallszahl gleich 42 ist.
        // Falls die Zufallszahl 42 ist, setzen Sie Ihre erste Variable zum Speichern
        // von Wahrheitswerten auf „wahr“ ansonsten auf „falsch“.

        zahlEins = new Random().nextInt(101);

        if (zahlEins == 42) {
            wahrheitsWertEins = true;
        } else {
            wahrheitsWertEins = false;
        }

        // Nutzen Sie eine Schleife, um 100 Zufallszahlen im Bereich von 0 bis 50
        // aufzuaddieren
        // Falls die Summe der Zufallszahlen größer 2000, setzen Sie Ihre zweite
        // Variable zum Speichern von Wahrheitswerten auf „wahr“ ansonsten auf „falsch“.
        // (Setzen Sie Ihre Variable zum Speichern der Summe vor der Schleife wieder auf
        // 0.)

        zahlZwei=0;

        System.out.println("Die Zufallszahl ist 42: " + wahrheitsWertEins);

        for (zahlEins = 1; zahlEins <= 100; zahlEins++) {
            zahlZwei += new Random().nextInt(51);
        }
        
        if(zahlZwei>2000){
            wahrheitsWertZwei=true;
        }else{
            wahrheitsWertZwei=false;
        }
        System.out.println("Die Zufallszahlen die addiert wurden sind groeßer als 2000: "+wahrheitsWertZwei);
    }

}