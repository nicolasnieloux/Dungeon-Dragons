package character.equipment.defensive;

import character.equipment.defensive.DefensiveEquipment;

public class Bouclier extends DefensiveEquipment {
    public Bouclier(String name, int defenseLevel) {
        super(name, defenseLevel);
    }

    public Bouclier(String type) {
        super(type);
    }



    @Override
    public String toString() {
        return "\ntype: Bouclier" + super.toString();
    }
}

