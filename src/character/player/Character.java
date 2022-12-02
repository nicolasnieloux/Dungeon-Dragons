package character.player;


import character.equipment.defensive.DefensiveEquipment;
import character.equipment.offensive.OffensiveEquipment;


public abstract class Character {

    //Attributes
    protected String name;
    protected int pointLife;
    protected int attackStrength;

    protected String type;

    public String getType() {
        return type;
    }

    public Character(){}
    public Character(String name, String type, int pointLife, int attackStrength) {
        this.name = name;
        this.type = type;
        this.pointLife = pointLife;
        this.attackStrength = attackStrength;

//        this.weaponOff = weaponOff;
//        this.armour = armour;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    protected int position;

    @Override
    public String toString() {
        return "Character{" +
                "weaponOff=" + weaponOff +
                ", armour=" + armour +
                '}';
    }

    protected OffensiveEquipment weaponOff;
    protected DefensiveEquipment armour;

    //Constructors

    public OffensiveEquipment getWeaponOff() {
        return weaponOff;
    }

    public void setWeaponOff(OffensiveEquipment weaponOff) {
        this.weaponOff = weaponOff;
    }

    public DefensiveEquipment getArmour() {
        return armour;
    }

    public void setArmour(DefensiveEquipment armour) {
        this.armour = armour;
    }

    public Character(String name) {
        this.name = name;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPointLife() {
        return pointLife;
    }

    public void setPointLife(int pointLife) {
        this.pointLife = pointLife;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }
}
