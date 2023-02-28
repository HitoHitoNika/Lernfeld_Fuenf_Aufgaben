package EinfacheDatentypen.Grundlagen;

public class Bedingungen {
    public static void main(String[] args) {
        // Beispiele
        int a = 5, b = 6, c = 7;
        // Eine boolean-Variablen anlegen, die bei erfolgreicher Auswertung der
        // Bedingung
        // auf true gesetzt wird.

        // "if-Testen" ob 5 größer als 7 ist (dazu die in a und b gespeicherten Werte
        // vergleichen)
        if (a > b) {
            System.out.println(a + " ist nicht groesser als " + b);
        }
        // if-else
        if (c == a) {
            System.out.println(c + " = " + a);
        } else {
            System.out.println(c + " ungleich " + a);
        }
    }

    static void aufgabeEins() {
        // Aufgabe 1
        // Speichern Sie die zwei Zahlen a = 17 und b = 57 in einer int-Variablen ab.
        // Testen Sie, ob b größer a ist, falls ja, geben Sie eine entsprechende
        // Nachricht in der Konsole aus.

        int a = 17;
        int b = 57;

        if (b > a) {
            System.out.println(b + "ist groesser als " + a);
        } else {
            System.out.println(b + "ist kleiner als " + a);
        }

    }

    static void aufgabeZwei() {
        // Aufgabe 2
        // Legen Sie eine dritte Variable c an die den Wert 61 zugewiesen bekommt.
        // Testen Sie ob a = b, falls nein, prüfen Sie, ob a = c ist. Nutzen Sie eine
        // if-else Konstruktion.
        // Geben Sie dem Test entsprechende sinnvolle Rückmeldungen auf der Konsole aus.
        int a = 61;
        int b = 44;
        int c = 61;
        if (a == b) {
            System.out.println(a + " = " + b);
        } else if (a == c) {
            System.out.println(a + " != " + b + " ABER " + a + " = " + c);
        }
    }
}
