package character.equipment.offensive;

public class Sort extends OffensiveEquipment {

    public Sort(String name, int attackLevel) {
        super(name, attackLevel);
    }


    @Override
    public String toString() {
        return "\ntype: Sort" + super.toString();
    }
}
