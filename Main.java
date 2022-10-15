import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Création de l'objet "tableau colis", qui contient les (x) colis que les lutins veulent trier.
        int[] colis = new int [5];

        //Appel de la fonction
        tri(colis);
    }

    //Création de la méthode tri.
    public static void tri(int[] colis) {

        //Ces variables représentent les traineaux.
        //Pour l'instant les traineaux sont vides, elles sont donc initialisées à zéro.
        int etoileFilante = 0;
        int auroreBoreale = 0;
        int banquise = 0;
        int poids;

        //Les arraylist serviront pour la récap

        List<Integer>poidsEtoileFilante = new ArrayList<>();
        List<Integer>poidsAuroreBoreale = new ArrayList<>();
        List<Integer>poidsBanquise = new ArrayList<>();

        Scanner entree = new Scanner(System.in);

        for (int i = 0; i < colis.length; i++) {
            System.out.println("Entrez le poids du colis n°" + (i+1) + " en grammes :");

            // Récupération de l'entrée utilisateur
            poids = entree.nextInt();

            //Enregistrement des poids dans un tableau nécessaire pour utiliser la méthode poidsEtoileFilante()
            //colis[i] = poids;

            if(poids >0 && poids < 500) {
                etoileFilante += 1;
                poidsEtoileFilante.add(poids);
                System.out.println("Ce colis de " + poids + "g va dans le traîneau Etoile filante.");
                System.out.println("Etoile filante : " + etoileFilante + " colis. Poids = " + poidsEtoileFilante);
                System.out.println(" ");
            }

            else if (poids <= 5000) {
                auroreBoreale += 1;
                poidsAuroreBoreale.add(poids);
                System.out.println("Ce colis de " + poids + "g va dans le traîneau Aurore Boréale.");
                System.out.println("Aurore Boréale : " + auroreBoreale);
                System.out.println(" ");

            }
            else {
                banquise += 1;
                poidsBanquise.add(poids);
                System.out.println("Ce colis de " + poids + "g va dans le traîneau Banquise.");
                System.out.println("Banquise : " + banquise);
                System.out.println(" ");

            }
        }

        entree.close();

        //Pour que les lutins Equipiers puissent vérifier le chargement avant le départ, lutin Manager prépare une récap :

        //Enregistrement des résultats du tri dans des variables
        String recap1 = "Etoile filante : " + etoileFilante + " colis. Poids : " + poidsEtoileFilante;
        String recap2 = "Aurore Boréale : " + auroreBoreale + " colis. Poids : " + poidsAuroreBoreale;
        String recap3 = "Banquise : " + banquise + " colis. Poids : " + poidsBanquise;

        // Création d'une arrayList qui sera la récap générale de la répartition des colis.

        /* Bien sûr, il est possible aussi d'imprimer directement les variables recap1 à 3 ou après
        concaténation dans une variable de type String recapGenerale
        */
        List<String> recapGenerale = new ArrayList<>() {
            {
                add(recap1);
                add(recap2);
                add(recap3);
            }
        };

        System.out.println(" ");

        // Impression de la récap
        System.out.println("Voici la récap de la répartition finale dans les traîneaux.");
        System.out.println("Veillez à ce que chaque traîneaux contienne le bon nombre de colis.");
        System.out.println(recapGenerale);

        
    }

}