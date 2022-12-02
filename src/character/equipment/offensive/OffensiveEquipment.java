package character.equipment.offensive;

abstract public class OffensiveEquipment {
    private String name;
    private int attackLevel;

    public OffensiveEquipment(String name, int attackLevel) {
        this.name = name;
        this.attackLevel = attackLevel;
    }

    public OffensiveEquipment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackLevel() {
        return attackLevel;
    }


    public static void main(String[] args) {
    }

    @Override
    public String toString() {
        return "\nname: " + getName() +
                "\nattackLevel : " + getAttackLevel();
    }
}
