package menu;

import character.player.Character;
import character.player.Warrior;
import character.player.Wizard;

import java.util.Objects;
import java.util.Scanner;

public class Menu {

    Character character;

    /**
     * Menu principal, Création/Modification du personnage
     */
    public void printMainMenu() {

        String choice;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Création de personnage (1) ou quitter la partie (2) ?");
        choice = keyboard.nextLine();
        if (choice.equals("1")) {
            System.out.println("Bienvenue dans le jeu D&D");
            do {
                createOrModify();
            } while (validateChoice() == false);
        } else if (choice.equals("2")) {
            System.out.println("alors on veut arreter");
            System.exit(0);
        } else {
            printMainMenu();
        }
    }


    /**
     * Demande du nom avec la saisie de l'utilisateur
     *
     * @return String Nom de l'utilisateur
     */
    public String askName() {
        String name;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Quel est le nom de votre personnage) ?");
        name = keyboard.nextLine();
        return (name);
    }

    /**
     * Demande le type du personnage avec la saisie de l'utilisateur
     *
     * @return String Type du personnage
     */
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

    /**
     * Modifier le personnage et Valider celui-ci pour lancer la partie
     *
     * @return Boolean validation
     */
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

    /**
     * Fonction création ou modification du personnage
     */

    public void createOrModify() {
        String nameCharacter = askName();
        String typeCharacter = askType();

        if (character != null) {
            character.setName(nameCharacter);
        } else {
            if (Objects.equals(typeCharacter, "Warrior")) {
                Warrior warrior = new Warrior(nameCharacter);
                System.out.println(warrior);
            } else if (Objects.equals(typeCharacter, "Wizard")) {
                Wizard wizard = new Wizard(nameCharacter);
                System.out.println(wizard);
            }
        }
    }
}
