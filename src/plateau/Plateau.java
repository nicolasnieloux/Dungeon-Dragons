package plateau;

import bonus.*;
import character.equipment.offensive.Arme;
import character.player.Character;
import enemy.Dragon;
import enemy.Gobelin;
import enemy.Sorcier;
import game.PersonnageHorsPlateauException;

import java.util.ArrayList;

public class Plateau {
    ArrayList<Case> slot = new ArrayList<>();

    public ArrayList<Case> getBoard() {

        int nbCase = 63;
        for (int i = 1; i <= nbCase; i++) {
            switch (i) {
                case 45, 52, 56, 62 -> slot.add(new Dragon());
                case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47 -> slot.add(new Sorcier());
                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 -> slot.add(new Gobelin());
                case 2, 11, 5, 22, 38 -> slot.add(new Massue());
                case 19, 26, 42, 53 -> slot.add(new Epee());
                case 1, 4, 8, 17, 23 -> slot.add(new Eclair());
                case 48, 49 -> slot.add(new Fireball());
                case 7, 13, 31, 33, 39, 43 -> slot.add(new Potion());
                case 28, 41 -> slot.add(new PotionBig());
                default -> slot.add(new EmptyCase());
            }

        }
        return slot;
    }

    public int okValidateMove(Character p, int dice) throws PersonnageHorsPlateauException {

        int pos = p.getPosition() + dice;
        if (pos > 64) {
            throw new PersonnageHorsPlateauException();

        }
        p.setPosition(p.getPosition() + dice);
        return p.getPosition();

    }
}
