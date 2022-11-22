package enemy;

import plateau.Case;
import character.player.Character;
import java.util.Objects;

public class Enemy implements Case {

    String name;

    public Enemy(String name) {
        this.name = name;
    }

    @Override
    public void interract(Character c) {

        if (Objects.equals(name, "Christophe")) {
            System.out.println("Bah ouai, c'est une parenthèse");
            int pointLife= c.getPointLife();
            pointLife -=5;
            c.setPointLife(pointLife);


        } else {
            System.out.println("Un ennemi est devant vous!!!");
        }
    }
}