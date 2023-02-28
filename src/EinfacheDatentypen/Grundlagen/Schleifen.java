package EinfacheDatentypen.Grundlagen;

public class Schleifen {
    public static void main(String[] args) {
        // Beispiele
        int ausgabe = 0;
        // for-Schleife
        for (int zaehler = 0; zaehler < 100; zaehler++) {
            ausgabe = ausgabe + 1; // Alternativ Schreibweise => ausgabe++;
        }
        System.out.println(ausgabe);
        for (int i = 0; i < 100; i++) {
            ausgabe += 2;
        }
        System.out.println(ausgabe);
        // while-Schleife
        while (ausgabe > 0) {
            ausgabe = ausgabe - 1;
        }
        System.out.println(ausgabe);
        // do-while-Schleife
        do {
            ausgabe -= 3;
        } while (ausgabe > -1000);
        System.out.println(ausgabe);
        aufgabeEins();
    }

    static void aufgabeEins() {
        // Aufgabe 1
        // Zahlen von 1 bis 1000 aufaddieren
        // mit for-, while- und do-while-Schleifen
        int ausgabe = 0;
        for (int i = 1; i <= 1000; i++) {
            ausgabe += i;
        }
        System.out.println(ausgabe);
        ausgabe = 0;
        int zaehler = 0;
        while (zaehler < 1001) {
            ausgabe += zaehler;
            zaehler++;
        }
        System.out.println(ausgabe);
        ausgabe = 0;
        zaehler = 0;
        do {
            ausgabe += zaehler;
            zaehler++;
        } while (zaehler <= 1001);
        System.out.println(ausgabe);

    }

    static void aufgabeZwei() {
        // Aufgabe 2
        // Zahlen von 500 bis 1000 addieren
        int ausgabe = 0;
        for (int i = 500; i < 1001; i++) {
            ausgabe += i;
        }
        System.out.println(ausgabe);

    }

    static void aufgabeDrei() {
        // Aufgabe 3
        // Gerade Zahlen von 1 bis 1000 addieren
        int ausgabe = 0;
        for (int i = 0; i <= 1000; i += 2) {
            ausgabe += i;
        }
        System.out.println(ausgabe);

    }

    static void aufgabeVier() {
        // Aufgabe 4
        // Ungerade Zahlen von 1000 bis 1500 addieren
        int ausgabe = 0;
        for (int i = 1000; i <= 1500; i++) {
            if (i % 2 != 0) {
                ausgabe += 1;
            } else {
                // Keine ungerade Zahl also passiert nichts
            }
        }
        System.out.println(ausgabe);
    }
}
