package character.equipment.offensive;


public class Arme extends OffensiveEquipment {

    public Arme(String name, int attackLevel) {
        super(name, attackLevel);
    }


    @Override
    public String toString() {
        return "\ntype: Arme" + super.toString();
    }
}

