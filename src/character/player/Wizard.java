package character.player;

import character.equipment.defensive.Philtre;
import character.equipment.offensive.Sort;

public class Wizard extends character.player.Character {

    public Wizard(String name) {
        super(name);
        setPointLife(6);
        setAttackStrength(15);
        this.weaponOff=new Sort("Flameche",1);
        this.armour = new Philtre("Potion", 1);
  }

    @Override
    public String toString() {
        return "Les stats de votre personnage:  \n" +
                "\nVotre nom : " + getName()+"\n" +
                "classe :"+ "Wizard \n"+
                "Point de vie : " + getPointLife()+"\n" +
                "Force d'attaque : " + getAttackStrength() +"\n"+
                "\nWeapon Offensive" + weaponOff +"\n"+
                "\nArmour" + armour +"\n";
    }
}
