package bonus;

import character.player.Character;
import plateau.Case;

public class Potion implements Case {

    //Attributs
    public int soin;

    public Potion(int soin) {
        this.soin = soin;
    }

    @Override
    public void interract(Character c) {


        if (soin == 5) {
            int pointLife = c.getPointLife();
            pointLife += 5;
            c.setPointLife(pointLife);

            System.out.println("Vous avez trouvé une grande potion");


        } else {

            int pointLife = c.getPointLife();
            pointLife += 2;
            c.setPointLife(pointLife);

            System.out.println("Vous avez trouvé une petite potion");

        }
    }
}
