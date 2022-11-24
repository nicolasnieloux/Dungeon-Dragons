package bonus;

import character.player.Character;
import plateau.Case;

public class PotionBig implements Case {
    @Override
    public void interract(Character c) {
        System.out.println("\nVous avez trouvé une grande potion");
        System.out.println("\nVous gagnez 5 points de vie");
        PotionBig potionBig = new PotionBig();
        System.out.println(potionBig);
        int pointLife = c.getPointLife();
        pointLife += 5;
        c.setPointLife(pointLife);
    }
}
