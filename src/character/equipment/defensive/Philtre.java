package character.equipment.defensive;

public class Philtre extends DefensiveEquipment {

    public Philtre(String name, int defenseLevel) {
        super(name, defenseLevel);

    }

    @Override
    public String toString() {
        return "\ntype: Philtre" + super.toString();
    }
}

