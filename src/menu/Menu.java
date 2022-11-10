package menu;

import java.util.Scanner;


public class Menu {


    public void startGame() {

        String choice;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Création de personnage (1) ou quitter la partie (2) ?");
        choice = keyboard.nextLine();
        if (choice.equals("1")) {
            System.out.println("Bienvenue dans le jeu D&D");
        } else if (choice.equals("2")) {
            System.out.println("alors on veut arreter");
            System.exit(0);
        } else {
            startGame();
        }
    }


    public String askName() {
        String name;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Quel est le nom de votre personnage) ?");
        name = keyboard.nextLine();
        return (name);
    }

    public String askType() {
        String response;
        String type = null;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Choisissez votre personnage ?");
        System.out.println("Warrior (1) - Wizard (2)");
        response = keyboard.nextLine();

        switch (response) {
            case "1" -> type = "Warrior";
            case "2" -> type = "Wizard";
            default -> type=askType();
        }
        return (type);
    }
}