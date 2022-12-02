package character.equipment.offensive;

import character.player.Character;
import character.player.Wizard;
import plateau.Case;

public class Sort extends OffensiveEquipment implements Case {

    public Sort(String name, int attackLevel) {
        super(name, attackLevel);
    }

    public Sort(String name){super(name);}
    @Override
    public String toString() {
        return "\ntype: Sort" + super.toString();
    }

    @Override
    public void interract(Character c) {
        System.out.println("\nUne technique magique traine par terre : " + getName());

        if (c instanceof Wizard) {
            System.out.println("\nVous gagnez " + getAttackLevel() + " points d'attaque");

            int attackLevel = c.getAttackStrength();
            attackLevel += getAttackLevel();
            c.setAttackStrength(attackLevel);
        } else {
            System.out.println("Dommage, vous êtes trop faible niveau intelligence pour apprendre ce sort!!");
        }
    }

}
