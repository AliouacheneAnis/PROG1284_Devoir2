/*
  Titre      : PROG1284 Devoir2
  Auteur     : Anis Aliouachene
  Date       : 20/10/2022
  Description: Affecter des valeur au hasard dans un Tableau puis retourner le maximum et son index 
  Version    : 0.0.1
*/

// Importation des libraires 
import java.util.Random;
import java.util.ArrayList;

// Declaration de la class 
public class PlusGrandeValeur {

    // Declaration des constantes
    final int MIN = 0, MAX = 100, TAILLE = 15;

    // Declaration des variables
    int NbrMax = 0, Index = 0;
    Random rand = new Random(); // fonction random

    // Fonction affectation pour remplir le tableau avec des variables aléatoire a l'aide de la fonction random
    public void affectation(ArrayList<Integer> Tableau) {
        for (int i = 0; i < TAILLE; i++) {
            Tableau.add(rand.nextInt(MAX - MIN + 1) + MIN);
        }
    }

    // Fonction afin d'avoir le maximum du tableau et son index a l'aide de le fonction Indexof
    public void recuperationMaxEtIndex(ArrayList<Integer> Tableau) {
        for (int i = 0; i < TAILLE; i++) {
            System.out.println("Tableau[" + i + "] = " + Tableau.get(i));
            if (Tableau.get(i) > NbrMax) {
                NbrMax = Tableau.get(i);
                Index = Tableau.indexOf(NbrMax);
            }
        }
    }

    // Fonction pour afficher le tableau et le maximum plus l'index
    public void affichage(ArrayList<Integer> Tableau) {
        System.out.println("********* Affichage Tableau *************");
        for (int i = 0; i < TAILLE; i++) {
            System.out.println("Tableau[" + i + "] = " + Tableau.get(i));
        }
        System.out.println("Le plus grand nombre du tableau : " + NbrMax);
        System.out.println("Il est a l'Index : " + Index);
        System.out.println("Press any key to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
