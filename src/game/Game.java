package game;
import character.Character;

import java.util.Random;

public class Game {

int playerPosition=1;
    Character player;
    public Character createPlayer(String nameCharacter, String typeCharacter) {
        Character player = new Character(nameCharacter,typeCharacter );
//        System.out.println(player);
        return player;
    }



// Lancement du dé
    public int rollDice() {
        int de = (int)(Math.random()*6+1);
        System.out.println("Résultat du dé : " + de);
        return de;
    }


    public void playGame(){

        while (playerPosition < 64) {
            int de = rollDice();
            playerPosition +=de;
            System.out.println("La position du joueur est : " + playerPosition + "/64");
        }
        System.out.println("You win");

    }

}
