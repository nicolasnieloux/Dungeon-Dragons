package character.equipment.offensive;

public class OffensiveEquipment {
    private String name;
    private String type;
    private int attackLevel;

    public OffensiveEquipment(String name, int attackLevel) {
        this.name = name;
        this.attackLevel = attackLevel;
    }

    // Getter et Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
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
