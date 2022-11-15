package game;

import character.Character;
import menu.Menu;

import java.util.Scanner;

public class Game {

    Menu restart = new Menu();
    int playerPosition;

    // Lancement du dé
    public int rollDice() {
        int de = (int) (Math.random() * 6 + 1);
        System.out.println("Résultat du dé : " + de);
        return de;
    }


    public void playGame() {
        Scanner keyboard = new Scanner(System.in);
        String choice;
        playerPosition = 1;
        while (playerPosition <= 64) {
            int de = rollDice();
            playerPosition += de;
            System.out.println("La position du joueur est : " + playerPosition + "/64");
        }
        System.out.println("You win");
        System.out.print("Voulez-vous rejouer (1) ou Quitter (2) ?");
        choice = keyboard.nextLine();
        if (choice.equals("1")) {
            System.out.println("on rejoue");
            restart.printMainMenu();
            playGame();
        } else if (choice.equals("2")) {
            System.out.println("alors on veut arreter");
            System.exit(0);
        } else {
            System.out.println("ERROR ERROR ERROR");
            System.exit(0);
        }
    }
}
