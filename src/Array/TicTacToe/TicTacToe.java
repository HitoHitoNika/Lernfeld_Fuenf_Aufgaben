package array.tictactoe;

import java.util.Scanner;

/**
 * TicTacToe mit wechselnden Eingaben
 * 
 * @autor Max B / github.com/hitohitonika
 * @version 1.3
 * @datum 1.03.2023
 */

public class TicTacToe {
    public static void main(String[] args) {
        char spielstein = 'x';
        char[][] spielfeld = new char[3][3];
        Scanner scanner = new Scanner(System.in);
        // Spielfeld zeichnen

        spielfeldZeichnen(spielfeld);

        while (true) {

            // Spielstein setzen

            spielfeld = spielsteinSetzen(spielstein, scanner, spielfeld);

            // Spielfeld zeichnen

            spielfeldZeichnen(spielfeld);

            // Gewinnbedingung prüfen
            if (gewinnbedingungPruefen(spielfeld, spielstein)) {
                break;
            } else if (spielstein == 'x') {
                spielstein = 'o';
            } else {
                spielstein = 'x';
            }

        }

        System.out.println("Der Gewinner ist: " + spielstein);

    }

    private static boolean gewinnbedingungPruefen(char[][] spielfeld, char spielstein) {
        if (spielfeld[0][0] == spielstein && spielfeld[0][1] == spielstein && spielfeld[0][2] == spielstein) {
            return true;
        } else if (spielfeld[1][0] == spielstein && spielfeld[1][1] == spielstein && spielfeld[1][2] == spielstein) {
            return true;
        } else if (spielfeld[2][0] == spielstein && spielfeld[2][1] == spielstein && spielfeld[2][2] == spielstein) {
            return true;
        } else if (spielfeld[0][0] == spielstein && spielfeld[1][1] == spielstein && spielfeld[2][2] == spielstein) {
            return true;
        } else if (spielfeld[0][2] == spielstein && spielfeld[1][1] == spielstein && spielfeld[2][0] == spielstein) {
            return true;
        } else if (spielfeld[0][0] == spielstein && spielfeld[1][0] == spielstein && spielfeld[2][0] == spielstein) {
            return true;
        } else if (spielfeld[0][1] == spielstein && spielfeld[1][1] == spielstein && spielfeld[2][1] == spielstein) {
            return true;
        } else if (spielfeld[0][2] == spielstein && spielfeld[1][2] == spielstein && spielfeld[2][2] == spielstein) {
            return true;
        }
        return false;
    }

    private static void spielfeldZeichnen(char[][] spielfeld) {
        for (int zeile = 0; zeile < 3; zeile++) {
            for (int spalte = 0; spalte < 3; spalte++) {
                System.out.print(spielfeld[zeile][spalte] + "  |  ");
            }
            System.out.println();
        }
    }

    private static char[][] spielsteinSetzen(char spielstein, Scanner scanner, char[][] spielfeld) {
        System.out.println("Zeile 1-3");
        int zeile = scanner.nextInt() - 1;
        System.out.println("Spalte 1-3");
        int spalte = scanner.nextInt() - 1;
        spielfeld[zeile][spalte] = spielstein;
        return spielfeld;
    }
}
