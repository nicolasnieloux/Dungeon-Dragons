package menu;

import character.player.Character;

import java.util.Scanner;

public class Menu {


    public void startGamePresentation() {
        System.out.println("Bienvenue dans le jeu D&D");
    }



    public String createOrQuit() {
        String choice;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Création de personnage (1) ou quitter la partie (2) ?");
        choice = keyboard.nextLine();
        return choice;
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
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Choisissez votre personnage ?");
        System.out.println("Warrior (1) - Wizard (2)");
        response = keyboard.nextLine();
        return (response);
    }

    /**
     * Modifier le personnage et Valider celui-ci pour lancer la partie
     *
     * @return Boolean validation
     */
    public String validateChoice() {
        String choice;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Voulez-vous valider (1) ou  modifier votre personnage (2)");
        choice = keyboard.nextLine();
       return choice;
    }


    public String endOrGame(){
        Scanner keyboard = new Scanner(System.in);
        String choiceEndGame;
        System.out.println("Partie terminée");
        System.out.print("Voulez-vous rejouer (1) ou Quitter (2) ?");
        choiceEndGame = keyboard.nextLine();
        return choiceEndGame;
    }




}