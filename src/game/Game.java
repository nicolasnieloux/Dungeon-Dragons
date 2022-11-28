package game;


import character.player.Character;
import character.player.Warrior;
import character.player.Wizard;
import menu.Menu;
import plateau.Case;
import plateau.EmptyCase;
import plateau.Plateau;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Game {

    Menu menu = new Menu();
    Plateau plateau = new Plateau();

    ArrayList<Case> slot = new ArrayList<>();

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

    public String askName() {
        String name = menu.askName();
        return name;
    }

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


    /**
     * Lancer le dé
     *
     * @return int valeur du dé
     */
    public static int rollDice() {
//        int de = (int) (Math.random() * 6 + 1);
        int de = 1;
        return de;
    }

    public void endGame() {
        String choiceEndGame = menu.endOrGame();
        if (choiceEndGame.equals("1")) {
            System.out.println("on rejoue");
            try {
                playGame();
            } catch (PersonnageHorsPlateauException e) {

            }
        } else if (choiceEndGame.equals("2")) {
            System.out.println("alors on veut arreter");
            System.exit(0);
        } else {
            System.out.println("ERROR ERROR ERROR");
            System.exit(0);
        }
    }

    //Fonction jouer une partie
    public void playOneTurn(Character perso, ArrayList<Case> slot) {

        Scanner keyboard = new Scanner(System.in);
        try {
            while (perso.getPointLife()>0) {

                System.out.println("Press enter to continue");
                keyboard.nextLine();

                int de = rollDice();
                System.out.println("Résultat du dé : " + de);

                int playerPosition= plateau.okValidateMove(perso, de); //Exception


                System.out.println("La position du joueur est : " + playerPosition + "/64");
                slot.get(playerPosition).interract(perso);


                System.out.println(perso);
            }

            if (perso.getPointLife()<=0){
                System.out.println("You died!");
            }
        } catch (PersonnageHorsPlateauException e) {
            System.out.println(e);
        } finally {
            endGame();
        }


    }


    public ArrayList<Case> boardChoice(){
        String boardType=Menu.choiceBoard();

        if (boardType.equals("1")){

           slot=plateau.getBoardFixe();
        } else {
          slot= plateau.getBoardRandom();
        }
        return slot;
    }

    public void playGame() throws PersonnageHorsPlateauException {

//Appel de la fonction pour le titre du jeu
        menu.startGamePresentation();

//Choix Créer le personnage ou Arreter le jeu
        String choix = menu.createOrQuit();
        if (choix.equals("1")) {
            System.out.println("Bienvenue dans la création du personnage");
            Character c = create();

            validatePerso();
            c.setPosition(0);
           ArrayList<Case> typeBoard=boardChoice();
            System.out.println(typeBoard);



              playOneTurn(c, typeBoard);


        } else if (choix.equals("2")) {
            System.out.println("alors on veut arreter");
            System.exit(0);
        }
    }

}




