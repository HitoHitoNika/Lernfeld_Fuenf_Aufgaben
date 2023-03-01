package Array.Wetterstation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * CSV_Reader / Wetterstationdatenauswertung
 * 
 * @autor Max B / github.com/hitohitonika
 * @version 1.3
 * @datum 1.03.2023
 */

public class CSV_Reader {

    /*
     * Lernjobs
     * 
     * 1) Datenmengen aus CSV-Datei einlesen
     * 
     * a)Legen Sie einen BufferedReader zum einlesen der CSV-Datei an.
     * Lesen Sie zeilenweise alle Daten ein und geben Sie diese aus.
     * b)Speichern sie die eingelesenen Temperaturen extra ab.
     * c)Runden Sie die gespeicherten Tempereraturwerte auf zwei Nach-
     * kommastellen und geben Sie diese aus.
     *
     * 2) Temperaturwerte auslesen
     * 
     * Berechnen Sie folgende Werte und geben Sie diese auf der Konsole aus.
     * a)Die Maximaltemperatur.
     * b)Die Minimaltemperatur.
     * c)Die durchschnittliche Temperatur.
     */
    public static void main(String[] args) throws IOException {
        // Das ist der Dateipfad in meinem Fall, müsst ihr bei euch ändern !
        String dateipfad = "/C://Users//User//Documents//Schulsachen/aussentemperatur_ucb.csv/";

        BufferedReader csvReader = new BufferedReader(new FileReader(dateipfad));

        String buffer;
        String[] csvDaten = new String[5000];
        String[] temperaturString = new String[5000];
        String[] datumString = new String[5000];
        double[] temperaturDouble = new double[5000];

        // Auslesen der Datei erfolgt wie folgt
        int zaehler = 0;
        buffer = csvReader.readLine(); // Um erste Zeile rauszufiltern => wirft exception
        while (true) {
            buffer = csvReader.readLine();
            if (buffer == null) {
                break;
            } else {
                csvDaten[zaehler] = buffer;

            }
            zaehler++;
        }
        csvReader.close();
        // String teilen und Temperatur in double überführen
        for (int i = 0; i < zaehler - 1; i++) {
            String[] teile = csvDaten[i].split(",");
            temperaturString[i] = teile[1];
            datumString[i] = teile[0];
        }
        for (int i = 0; datumString[i] != null; i++) {
            temperaturDouble[i] = Double.parseDouble(temperaturString[i]);
            temperaturDouble[i] = round(temperaturDouble[i], 2);
        }
        for (int i = 0; datumString[i] != null; i++) {
            System.out.println("Am " + datumString[i]);
            System.out.println("Waren es " + temperaturDouble[i] + " Grad" + "\n");

        }
        aufgabe2(temperaturDouble);
    }

    public static double round(double value, int places) {
        if (places < 0)
            throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    static void aufgabe2(double[] temp) {
        double min = temp[0]; // min soll temp sein da wenn wir min 0 setzen wir Gefahr laufen das es keine
                              // Temperatur unter 0 gibt
        double max = 0;
        double mid = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < min) {
                min = temp[i];
            }
            if (temp[i] > max) {
                max = temp[i];
            }
            mid += temp[i];
        }
        mid = mid / temp.length;
        System.out.println("Max Temperatur ist: " + max);
        System.out.println("Mittlere Temperatur ist: " + mid);
        System.out.println("Niedrigste Temperatur ist: " + min);
    }

}
