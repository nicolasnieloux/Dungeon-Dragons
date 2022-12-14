package character.equipment.defensive;

abstract public class DefensiveEquipment {
    protected String name;
    protected int defenseLevel;

    public DefensiveEquipment(String name, int defenseLevel) {
        this.name = name;
        this.defenseLevel = defenseLevel;
    }

    public DefensiveEquipment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "\nname: " + name + "\n" +
                "defenseLevel: " + defenseLevel + "\n";
    }
}
