import java.util.Random;

public class PlusGrandeValeur {

    public static void main(String[] args) {

        final int MIN = 0, MAX = 100, TAILLE = 14;
        int NbrMax = 0, Index = 0;
        int[] Tab = new int[TAILLE];
        Random rand = new Random();

        for (int i = 0; i < TAILLE; i++) {
            Tab[i] = rand.nextInt(MAX - MIN + 1) + MIN;
        }

        for (int i = 0; i < TAILLE; i++) {
            System.out.println("Tableau[" + i + "] = " + Tab[i]);
            if (Tab[i] > NbrMax) {
                NbrMax = Tab[i];
                Index = i;
            }
        }

        System.out.println("Le plus grand nombre du tableau : " + NbrMax);
        System.out.println("Il est a l'Index : " + Index);

    }
git
}
