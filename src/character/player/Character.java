package character.player;


import character.equipment.defensive.DefensiveEquipment;
import character.equipment.offensive.OffensiveEquipment;


import java.util.Objects;

public abstract class Character {

    //Attributes
    protected String name;

    protected int pointLife;
    protected int attackStrength;

    protected int position;
    protected OffensiveEquipment weaponOff ;
    protected DefensiveEquipment armour;


    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    //Constructors
    public Character() {
    }

    public Character(String name) {
        this.name = name;
    }

    public Character(String name, String type) {
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
