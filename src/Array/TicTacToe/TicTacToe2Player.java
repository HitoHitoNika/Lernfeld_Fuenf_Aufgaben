package Array.TicTacToe;

import java.util.Scanner;

public class TicTacToe2Player {

    /**
     * TicTacToe im Zweispielermodus.
     * 
     * @autor Dietrich
     * @version 1.3
     * @datum 12.02.2023
     * @kompetenzen Strukturierte Programmierung: Einfache Datentypen, Schleifen,
     *              Bedingungen (verkn�pft), zweidimensionale Arrays anwenden
     * @didaktischReduziert Falsche Eingaben, Mehrfach setzen eines Spielsteins auf
     *                      ein Feld
     */

    public static void main(String[] args) {

        // Anlegen des Spielfelds
        char[][] spielfeld = new char[3][3];

        // Variablen f�r Spielablauf setzen
        boolean gewinner = false;
        Scanner input = new Scanner(System.in);

        // Ausgabe des Spielfelds
        System.out.println("Unser Spielfeld: ");
        System.out.println("----------------");
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld.length; j++) {
                System.out.print(spielfeld[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------");

        // Spielerauswahl
        char spielstein = 'X'; // von Spieler 1

        // Spiel
        while (!gewinner) {

            // Spielstein platzieren
            System.out.println("Mach deinen Zug.");
            System.out.println("In welcher Zeile setzt du den Spielstein? Zeile 1, 2 oder 3? ");
            int zeile = input.nextInt();
            System.out.println("In welcher Spalte setzt du den Spielstein? Spalte 1, 2 oder 3? ");
            int spalte = input.nextInt();

            // Spielstein seten
            spielfeld[zeile - 1][spalte - 1] = spielstein;

            // Spielfeld ausgeben
            System.out.println("Spielfeld");
            System.out.println("----------------");
            for (int i = 0; i < spielfeld.length; i++) {
                for (int j = 0; j < spielfeld.length; j++) {
                    System.out.print(spielfeld[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("----------------");

            // Siegzug pr�fen
            if ( // waagerecht drei in einer Reihe?
            spielfeld[0][0] == spielfeld[0][1] && spielfeld[0][1] == spielfeld[0][2] && spielfeld[0][2] == spielstein
                    || spielfeld[1][0] == spielfeld[1][1] && spielfeld[1][1] == spielfeld[1][2]
                            && spielfeld[1][2] == spielstein
                    || spielfeld[2][0] == spielfeld[2][1] && spielfeld[2][1] == spielfeld[2][2]
                            && spielfeld[2][2] == spielstein
                    ||
                    // senkrecht drei in einer Reihe?
                    spielfeld[0][0] == spielfeld[1][0] && spielfeld[1][0] == spielfeld[2][0]
                            && spielfeld[2][0] == spielstein
                    || spielfeld[0][1] == spielfeld[1][1] && spielfeld[1][1] == spielfeld[2][1]
                            && spielfeld[2][1] == spielstein
                    || spielfeld[0][2] == spielfeld[1][2] && spielfeld[1][2] == spielfeld[2][2]
                            && spielfeld[2][2] == spielstein
                    ||
                    // diagonal drei in einer Reihe?
                    spielfeld[0][0] == spielfeld[1][1] && spielfeld[1][1] == spielfeld[2][2]
                            && spielfeld[2][2] == spielstein
                    || spielfeld[2][0] == spielfeld[1][1] && spielfeld[1][1] == spielfeld[0][2]
                            && spielfeld[0][2] == spielstein) {
                gewinner = true;
                System.out.println("Du hast gewonnen!");
            }
            // Spielerwechsel
            if (spielstein == 'X') {
                spielstein = 'O'; // setze Spielstein auf Spieler2
            } else
                spielstein = 'X';
        }
    }
}
