package Daten_suchen_und_sortieren;

import java.util.Arrays;

public class Daten_sortieren {

    public static void main(String[] args) {
        int[] a = { 9, 3, 2, 4, 6, 1, 8 };
        a = bubbleSort(a);
        System.out.println("Array a: ");
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
        //Arrays bieten eigene Methoden um zu sortieren
        int[] b = { 9, 3, 2, 4, 6, 1, 8 };
        System.out.println("Array b: ");
        Arrays.sort(b);
        for (int i : b) {
            System.out.print(i+" ");
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

}
