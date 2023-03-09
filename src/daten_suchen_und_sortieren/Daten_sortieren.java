package daten_suchen_und_sortieren;

import java.util.Arrays;

public class Daten_sortieren {

    public static void main(String[] args) {
        // Erstellung eines Arrays
        int[] a = { 9, 3, 2, 4, 6, 1, 8 };

        // unsortiertes array soll sortiert werden
        // da unsere bubbleSort Methode ein Array zurückgibt
        // wird hier das unsortierte Array mit dem sortierten überschrieben
        a = bubbleSort(a);

        // Ausgabe
        System.out.println("Array a: ");
        for (int i : a) {
            System.out.print(i + " ");
        }

        // Leerzeile
        System.out.println();

        // Arrays bieten eigene Methoden um zu sortieren

        // Erstellen eines Arrays
        int[] b = { 9, 3, 2, 4, 6, 1, 8 };

        // Sortieren das Arrays
        Arrays.sort(b);

        // Ausgabe
        System.out.println("Array b: ");
        for (int i : b) {
            System.out.print(i + " ");
        }

        // Bubblesort 2 Methode aus PowerPoint
        // Erstellung eines Arrays
        int[] c = { 9, 3, 2, 4, 6, 1, 8 };

        // unsortiertes array soll sortiert werden
        // da unsere bubbleSort Methode ein Array zurückgibt
        // wird hier das unsortierte Array mit dem sortierten überschrieben
        c = bubbleSort2(c);

        // Ausgabe
        System.out.println("Array c: ");
        for (int i : c) {
            System.out.print(i + " ");
        }

    }

    static int[] bubbleSort(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    static int[] bubbleSort2(int a[]) {
        int n = a.length;
        boolean getauscht = true;
        do {
            getauscht = false;
            for (int i = 0; i < n - 1; i++) {
                if (a[i + 1] < a[i]) {
                    int temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                    getauscht = true;
                }
            }
        } while (getauscht);
        return a;
    }

}
