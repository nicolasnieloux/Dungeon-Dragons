package character.equipment.defensive;

abstract public class DefensiveEquipment {
    protected String name;
    protected String type;
    protected int defenseLevel;

    public DefensiveEquipment(String name, int defenseLevel) {
        this.name = name;
        this.defenseLevel = defenseLevel;
    }


    public DefensiveEquipment(String type) {

        this.type = type;

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

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }

    @Override
    public String toString() {
        return  "\nname: " + name + "\n" +
                "defenseLevel: " + defenseLevel + "\n";
    }


}
