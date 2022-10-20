/*
  Titre      : PROG1284_Devoir2
  Auteur     : Anis Aliouachene
  Date       : 20/10/2022
  Description: Fonction main pour executer le programme et la class PlusGrandeValeur 
  Version    : 0.0.1
*/

package Tableau; 

// Importation des libraires 
import java.util.ArrayList;

// declaration class Principal 
public class Principal {

    // declaration class maion
    public static void main(String[] args) {
        
        // Declaration arraylist et objet de la class PlusGrandeValeur
        ArrayList<Integer> Tab = new ArrayList<Integer>();
        PlusGrandeValeur Tableau = new PlusGrandeValeur();

        // Traitement et Affichage
        Tableau.affectation(Tab);
        Tableau.recuperationMaxEtIndex(Tab);
        Tableau.affichage(Tab);
    }
}
