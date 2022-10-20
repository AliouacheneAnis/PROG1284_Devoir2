import java.util.Random;
import java.util.ArrayList;

public class PlusGrandeValeur {
    
    
    final int MIN = 0, MAX = 100, TAILLE = 15;
    int NbrMax = 0, Index = 0;
    int[] Tab = new int[TAILLE];
    Random rand = new Random();

    public void affectation(ArrayList<Integer> Tableau){

        for (int i = 0; i < TAILLE; i++) {
            Tableau.add(rand.nextInt(MAX - MIN + 1) + MIN);
        }
    }
    
    public void recuperationMaxEtIndex(ArrayList<Integer> Tableau){

        for (int i = 0; i < TAILLE; i++) {
        System.out.println("Tableau[" + i + "] = " + Tableau.get(i));
        if (Tableau.get(i) > NbrMax) {
            NbrMax = Tableau.get(i); 
            Index = Tableau.indexOf(NbrMax);
        }
        }
    }
    
    
    public void affichage(){

        System.out.println("Le plus grand nombre du tableau : " + NbrMax);
        System.out.println("Il est a l'Index : " + Index );

    }
}
