package Daten_suchen_und_sortieren;

public class Suchalgorithmen {
    public static void main(String[] args) {
        //Beispiel Sequentielle Suche
        int[] a={5,2,4,3,1};
        System.out.println("Die 7 ist in dem Array enthalten :"+seqSuche(a, 7));
        System.out.println("Die 3 ist in dem Array enthalten :"+seqSuche(a, 3));    
    }
    
    static boolean seqSuche(int[] a , int gesucht){
        for(int i=0;i<a.length;i++){
            if(a[i]==gesucht){
                return true;
            }
        }
        return false;
    }

    static boolean binSuche(int[]a, int x){
        
    }

}
