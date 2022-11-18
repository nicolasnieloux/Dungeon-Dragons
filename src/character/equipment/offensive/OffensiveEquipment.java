package character.equipment.offensive;

abstract public class OffensiveEquipment {
    private String name;
    private int attackLevel;

    public OffensiveEquipment(String name, int attackLevel) {
        this.name = name;
        this.attackLevel = attackLevel;
    }


    public static void main(String[] args) {
    }

    @Override
    public String toString() {
        return "\nname: " + name +
                "\nattackLevel : " + attackLevel;
    }
}
