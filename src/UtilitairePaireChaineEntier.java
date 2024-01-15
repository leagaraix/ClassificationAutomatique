import java.util.ArrayList;

public class UtilitairePaireChaineEntier {

    public static int indicePourChaine(ArrayList<PaireChaineEntier> listePaires, String chaine) {
        return 0;
    }

    //récupérer le score associé à un mot dans les listes de lexique à l'aide d'une recherche séquentielle (car listePaires n'est pas triée)
    public static int entierPourChaine(ArrayList<PaireChaineEntier> listePaires, String chaine) {
        //retourne l'entier associé à chaine dans listePaires (si elle est présente), 0 sinon

        int i = 0;
        while (i < listePaires.size() && listePaires.get(i).getChaine().compareTo(chaine) != 0) {
            i++;
        }

        if (i < listePaires.size() && listePaires.get(i).getChaine().compareTo(chaine) == 0) {
            return listePaires.get(i).getEntier();
        } else {
            return 0;
        }

    }

    public static String chaineMax(ArrayList<PaireChaineEntier> listePaires) {
        return "SPORTS";
    }


    public static float moyenne(ArrayList<PaireChaineEntier> listePaires) {
        return 0;
    }

}
