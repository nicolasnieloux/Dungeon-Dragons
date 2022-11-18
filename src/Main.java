import game.Game;
import game.PersonnageHorsPlateauException;
import menu.Menu;
import plateau.Plateau;

public class Main {
    public static void main(String[] args) throws PersonnageHorsPlateauException {
        System.out.println("Hello world! D&D");

        //Lancement du Menu principal pour la création du personnage
//        Menu start = new Menu();
//        start.printMainMenu();

        // Lancement de la partie
//        Game test = new Game();
//        test.playGame();

        Plateau testBoard = new Plateau();
        testBoard.board();

    }
}

