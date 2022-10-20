import java.util.ArrayList;

public class Principal {

  public static void main(String[] args) {
    
    ArrayList<Integer> Tab = new ArrayList<Integer>();
    PlusGrandeValeur Tableau = new PlusGrandeValeur(); 

    Tableau.affectation(Tab);
    Tableau.recuperationMaxEtIndex(Tab);
    Tableau.affichage();




  }
}
