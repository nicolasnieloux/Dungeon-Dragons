package character;

import character.equipment.DefensiveEquipment;
import character.equipment.OffensiveEquipment;

import java.util.Objects;

public class Character {

    //Attributes
    private String name;
    private String type;

    private int pointLife;
    private int attackStrength;

    private int position;
    private OffensiveEquipment weaponOff = new OffensiveEquipment();
    private DefensiveEquipment weaponDef = new DefensiveEquipment();

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
        this.type = type;
    }


    // Getter & Setter
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


    public void setDefensiveWeapon(String typeCharacter) {


        if (Objects.equals(typeCharacter, "Warrior")) {
            this.weaponDef.setName("bouclier en mousse");
            this.weaponDef.setType("Bouclier");
            this.weaponDef.setDefenseLevel(2);

        } else {
            weaponDef.setName("Pluto");
            weaponDef.setType("Baton de Mickey");
            weaponDef.setDefenseLevel(5);
        }
    }


    public void setOffensiveWeapon(String typeCharacter) {

        if (Objects.equals(typeCharacter, "Warrior")) {
            weaponOff.setName("épée en mousse");
            weaponOff.setType("Arme");
            weaponOff.setAttackLevel(1);

        } else {
            weaponOff.setName("embrumation");
            weaponOff.setType("Sort");
            weaponOff.setAttackLevel(3);
        }
    }

    public void setPlayerPoint(String typeCharacter) {
        if (Objects.equals(typeCharacter, "Warrior")) {
            setPointLife(10);
            setAttackStrength(10);
        } else {
            setPointLife(6);
            setAttackStrength(15);
        }
    }

    /**
     * @return string avec la description du perso
     */
    @Override
    public String toString() {
        String str;
        str = "Résumons votre choix: \n";
        str += "Votre nom : " + getName();
        str += "\nVotre type : " + getType();
        str += "\nPoint de vie : " + getPointLife();
        str += "\nForce d'attaque : " + getAttackStrength();
        str += "\nType d'arme : " + weaponOff.getType();
        str += "\nNom de l'arme : " + weaponOff.getName();
        str += "\nNiveau d'attaque : " + weaponOff.getAttackLevel();
        str += "\nType de défense : " + weaponDef.getType();
        str += "\nNom de la défense : " + weaponDef.getName();
        str += "\nNiveau de défense : " + weaponDef.getDefenseLevel();
        return str;
    }


}
