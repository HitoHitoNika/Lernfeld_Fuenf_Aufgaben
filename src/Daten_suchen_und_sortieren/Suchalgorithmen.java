package Daten_suchen_und_sortieren;

public class Suchalgorithmen {
    // Siehe Moodle PowerPoint "Daten suchen"
    public static void main(String[] args) {
        // Beispiel Sequentielle Suche
        int[] a = { 5, 2, 4, 3, 1 };
        System.out.println("Die 7 ist in dem Array enthalten :" + seqSuche(a, 7));
        System.out.println("Die 3 ist in dem Array enthalten :" + seqSuche(a, 3));
        // Im besten Fall liegt die Zahl auf der 0ten Stelle, also muss das Array nicht
        // komplett durchlaufen werden
        // Im schlechtesten Fall liegt die gesuchte Zahl auf der letzten Stelle, man
        // muss also das komplette Array durchlaufen

        // Beispiel Binäre Suche
        // Achtung das Array muss bereits sortiert sein
        int[] b = { 1, 2, 3, 4, 5 };
        System.out.println("Die Zahl 7 ist im Array enthalten :" + binSuche(a, 7));
        System.out.println("Die Zahl 3 ist im Array enthalten :" + binSuche(b, 3));
        // Im besten Fall liegt die gesuchte in der Mitte des Arrays
        // Im schlechtesten Fall an Anfang oder Ende
    }

    static boolean seqSuche(int[] a, int gesucht) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == gesucht) {
                return true;
            }
        }
        return false;
    }

    static boolean binSuche(int[] a, int x) {
        int links = 0;
        int rechts = a.length - 1;
        int mitte;
        while (links <= rechts) {
            mitte = links + ((rechts - links) / 2);
            if (a[mitte] == x) {
                return true;
            } else if (x < a[mitte]) {
                rechts = mitte - 1;
            } else {
                links = mitte + 1;
            }

        }
        return false;
    }

}
