package plateau;

public class Plateau {

    //Initailisation du plateau
    int nbCases= 64;

    //Affichage du plateau

    public void displayPlateau(){

        for (int i=0; i<nbCases-1; i++){
            System.out.print("|--| ");
        }
    }



}
