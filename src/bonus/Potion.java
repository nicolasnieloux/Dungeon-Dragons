package bonus;

import character.player.Character;
import plateau.Case;

public class Potion implements Case {


    @Override
    public void interract(Character c) {

        System.out.println("\nVous avez trouvé une petite potion");
        System.out.println("\nVous gagnez 2 points de vie");
        Potion potion = new Potion();
        System.out.println(potion);
        int pointLife = c.getPointLife();
        pointLife += 2;
        c.setPointLife(pointLife);

    }

}
