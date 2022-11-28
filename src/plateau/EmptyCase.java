package plateau;

import character.player.Character;

public class EmptyCase implements Case{
    @Override
    public void interract(Character c) {
        System.out.println("Chanceux ou non, vous êtes sur une case vide!!!");
    }
}
