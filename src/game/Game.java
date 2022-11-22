package game;


import character.player.Character;
import character.player.Warrior;
import character.player.Wizard;
import menu.Menu;
import plateau.Case;
import plateau.Plateau;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Game {

    Menu menu = new Menu();
    Plateau plateau = new Plateau();
    Character character;

    public void validatePerso() {

        String validChoice = menu.validateChoice();
        if (validChoice.equals("1")) {
            System.out.println("Votre personnage est validé, c'est parti!!!");

        } else if (validChoice.equals("2")) {
            System.out.println("Reprenons alors au début");
            Character c = create();
            validatePerso();
        }

    }

    //Fonction askName
    public String askName() {
        String name = menu.askName();
        return name;
    }

    //Fonction askType
    public String askType() {
        String type;
        String choix = menu.askType();

        switch (choix) {
            case "1" -> type = "Warrior";
            case "2" -> type = "Wizard";
            default -> type = askType();
        }
        return type;
    }

    //Affichage des stats
    public void showStat(Character personnage) {
        System.out.println(personnage);

    }

    //Fonction create un personnage
    public Character create() {
        String nameCharacter = askName();
        String typeCharacter = askType();
        Character character1;
        if (Objects.equals(typeCharacter, "Warrior")) {
            character1 = new Warrior(nameCharacter);
            System.out.println(character1);
        } else {
            character1 = new Wizard(nameCharacter);
            System.out.println(character1);
        }
        return character1;
    }


//Fonction validation du choix


    /**
     * Lancer le dé
     *
     * @return int valeur du dé
     */
    public int rollDice() {
        int de = (int) (Math.random() * 6 + 1);
        return de;
    }


    //Fonction jouer une partie
    public void playOneTurn(Character perso) {

        ArrayList<Case> slot = plateau.getBoard();
        Scanner keyboard = new Scanner(System.in);
        try {
            while (true) {
                int de = rollDice();
                int playerPosition = perso.getPosition() + de;
                perso.setPosition(playerPosition);
                System.out.println("Press enter to continue");
                keyboard.nextLine();
                System.out.println("Résultat du dé : " + de);


                if (playerPosition > 64) {
                    throw new PersonnageHorsPlateauException();
                }
                System.out.println("La position du joueur est : " + playerPosition + "/64");
                slot.get(playerPosition).interract(perso);
                System.out.println(perso);
            }
        } catch (PersonnageHorsPlateauException e) {
            System.out.println(e);
        } finally {

            System.out.println("You win");
            System.out.print("Voulez-vous rejouer (1) ou Quitter (2) ?");
            String choice = keyboard.nextLine();
            if (choice.equals("1")) {
                System.out.println("on rejoue");
                try {
                    playGame();
                } catch (PersonnageHorsPlateauException e) {
                    throw new RuntimeException(e);
                }
            } else if (choice.equals("2")) {
                System.out.println("alors on veut arreter");
                System.exit(0);
            } else {
                System.out.println("ERROR ERROR ERROR");
                System.exit(0);
            }
        }
    }


    public void playGame() throws PersonnageHorsPlateauException {
//        Scanner keyboard = new Scanner(System.in);
//        String choice;


//Appel de la fonction pour le titre du jeu
        menu.startGamePresentation();

//Choix Créer le personnage ou Arreter le jeu
        String choix = menu.createOrQuit();
        if (choix.equals("1")) {
            System.out.println("Bienvenue dans la création du personnage");
            Character c = create();

            validatePerso();
            c.setPosition(1);
            playOneTurn(c);

        } else if (choix.equals("2")) {
            System.out.println("alors on veut arreter");
            System.exit(0);
        }
    }

}




