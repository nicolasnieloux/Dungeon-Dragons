package character.equipment.offensive;

import character.player.Character;
import plateau.Case;

public class Arme extends OffensiveEquipment implements Case {

    public Arme(String name, int attackLevel) {
        super(name, attackLevel);
    }


    @Override
    public String toString() {
        return "\ntype: Arme" + super.toString();
    }

    @Override
    public void interract(Character c) {
        System.out.println("\nUne arme traîne par terre : " + getName());
        System.out.println("\nVous gagnez " + getAttackLevel() + " points d'attaque");


        int attackLevel = c.getAttackStrength();
        attackLevel += getAttackLevel();
        c.setAttackStrength(attackLevel);
    }


}

