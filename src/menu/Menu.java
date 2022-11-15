package menu;

import character.Character;

import java.util.Scanner;


public class Menu {

    Character character;


    public void printMainMenu() {

        String choice;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Création de personnage (1) ou quitter la partie (2) ?");
        choice = keyboard.nextLine();
        if (choice.equals("1")) {
            System.out.println("Bienvenue dans le jeu D&D");

            do {
                createOrModify();
                System.out.println(character.toString());

            } while (validateChoice() == false);

        } else if (choice.equals("2")) {
            System.out.println("alors on veut arreter");
            System.exit(0);
        } else {
            printMainMenu();
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
        String type;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Choisissez votre personnage ?");
        System.out.println("Warrior (1) - Wizard (2)");
        response = keyboard.nextLine();

        switch (response) {
            case "1" -> type = "Warrior";
            case "2" -> type = "Wizard";
            default -> type = askType();
        }
        return (type);
    }


    public Boolean validateChoice() {
        String choice;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Voulez-vous valider (1) ou  modifier votre personnage (2)");
        choice = keyboard.nextLine();
        if (choice.equals("1")) {
            System.out.println("Votre personnage est validé, c'est parti!!!");

            return true;
        } else if (choice.equals("2")) {
            System.out.println("Reprenons alors au début");
            return false;
        } else {
            return false;
        }
    }

    public void createOrModify() {
        String nameCharacter = askName();
        String typeCharacter = askType();


        if (character != null) {
            character.setName(nameCharacter);
            character.setType(typeCharacter);
            character.setPlayerPoint(typeCharacter);
            character.setOffensiveWeapon(typeCharacter);
            character.setDefensiveWeapon(typeCharacter);
        } else {
            character = new Character(nameCharacter, typeCharacter);
            character.setPlayerPoint(typeCharacter);
            character.setOffensiveWeapon(typeCharacter);
            character.setDefensiveWeapon(typeCharacter);
        }
    }

}
