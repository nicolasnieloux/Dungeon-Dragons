import character.Character;
import game.Game;
import menu.Menu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! D&D");
        // test class Character
//        Character Nico = new Character("nicolas","azezr");
//        System.out.println(Nico);
//
        Menu start = new Menu();
        start.startGame();

        String nameCharacter=start.askName();
        System.out.println("Votre nom est : " + nameCharacter );

        String typeCharacter=start.askType();
        System.out.println(typeCharacter);

        Game player = new Game();
        Character charact = player.createPlayer(nameCharacter,typeCharacter);
        System.out.println(charact);


    }
}