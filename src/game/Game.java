package game;
import character.Character;

import java.util.Random;

public class Game {

    Character player;
    public Character createPlayer(String nameCharacter, String typeCharacter) {
        Character player = new Character(nameCharacter,typeCharacter );
//        System.out.println(player);
        return player;
    }



// Lancement du dé
    public void rollDice() {
        int n;
        Random random = new Random();

        n= random.nextInt(5 +1)+1;
        System.out.println(n);
    }

    // Déplacement du joueur

    public void movePlayer(){


    }


    //Jouer 1 tour
    //Lancer le dé
    //Mise à jour de la position di joueur
    //Afficher la position du joueur


}
