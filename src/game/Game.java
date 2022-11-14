package game;
import character.Character;

public class Game {

    public Character createPlayer(String nameCharacter, String typeCharacter) {
        Character player = new Character(nameCharacter,typeCharacter );
//        System.out.println(player);
        return player;
    }
}
