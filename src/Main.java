import character.Character;
import game.Game;
import menu.Menu;
import plateau.Plateau;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! D&D");

//Lancement ou arrêt du jeu pour la création du personnage
        Menu start = new Menu();
        start.printMainMenu();

        //Lancement de la Game
        Game test = new Game();
        test.playGame();
    }
}

