package EinfacheDatentypen.Grundlagen;

import java.util.Scanner;

public class EingabeUndAusgabe {
    public static void main(String[] args) {
        // Scanner zum Einlesen von Eingaben anlegen

        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie eine Zahl von 0 bis 100 ein: ");

        // eingelesene Zahl abspeichern

        int zahl = input.nextInt();

        // eingelesene Zahl zu Testzwecken ausgeben

        System.out.println("Die eingegebene Zahl lautet " + zahl);

        System.out.println("Danke für die Eingabe!");

        input.close();
    }

    static void aufgabeEins() {
        // Aufgabe 1
        // Lesen Sie ein Scanner-Objekt an und lesen sie eine ganze Zahl ein.
        // Speicher Sie diese Zahl als int-Variable ab. Geben Sie die eingelesene
        // und abgespeicherte Zahl mit einer Nachricht wieder auf der Konsole aus.

        Scanner scanner = new Scanner(System.in);

        int zahl = scanner.nextInt();

        System.out.println(zahl);

        scanner.close();

    }

    static void aufgabeZwei() {
        // Aufgabe 2
        // Lesen Sue eine Kommazahl ein und geben Sie diese aus.
        // (Hinweis: Die Eingabe erfolgt mit einem Komma, z.B. "2,4"
        // Eclipse stellt die Zahlen dann mit einem Punkt dar "2.4")
        Scanner scanner = new Scanner(System.in);

        double neueZahl = scanner.nextDouble();

        System.out.println(neueZahl);

        scanner.close();
    }

    static void aufgabeDrei() {
        // Aufgabe 3
        // Lesen Sie einen String ein und geben Sie diesen aus.
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        System.out.println(text);

        scanner.close();
    }
}
