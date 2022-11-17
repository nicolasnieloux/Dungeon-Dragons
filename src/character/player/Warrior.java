package character.player;

import character.equipment.defensive.Bouclier;
import character.equipment.offensive.Arme;

public class Warrior extends character.player.Character {

//Constructor
    public Warrior(String name) {
        super(name);
        setPointLife(10);
        setAttackStrength(10);
        this.weaponOff=new Arme("Epee en mousse", 1);
        this.armour=new Bouclier("Bouclier en mousse",1);
    }

@Override
    public String toString() {
        return "Résumons votre choix: \n" +
                "\nVotre nom : " + getName() +"\n" +
                "classe :"+ "Warrior \n"+
                "Point de vie : " + getPointLife()+"\n" +
                "Force d'attaque : " + getAttackStrength() +"\n"+
                "\nWeapon Offensive: " + weaponOff +"\n"+
                "\nArmour: " + armour +"\n";
    }
}
