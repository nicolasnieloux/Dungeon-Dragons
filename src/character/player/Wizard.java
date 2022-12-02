package character.player;

import character.equipment.defensive.Philtre;
import character.equipment.offensive.Sort;

public class Wizard extends character.player.Character {

    protected String name;
    protected String type;
    protected int niveauVie;

    protected int niveauForce;
    protected String armeSort;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public void setNiveauVie(int niveauVie) {
        this.niveauVie = niveauVie;
    }

    public int getNiveauForce() {
        return niveauForce;
    }

    public void setNiveauForce(int niveauForce) {
        this.niveauForce = niveauForce;
    }

    public String getArmeSort() {
        return armeSort;
    }

    public void setArmeSort(String armeSort) {
        this.armeSort = armeSort;
    }

    public String getBouclier() {
        return bouclier;
    }

    public void setBouclier(String bouclier) {
        this.bouclier = bouclier;
    }



    public Wizard(String name, String type, int pointLife, int attackStrength, String armeSort, String bouclier) {
        this.name=name;
        this.type = type;
        this.pointLife = pointLife;
        this.attackStrength = attackStrength;
        this.weaponOff = new Sort(armeSort);
        this.armour = new Philtre(bouclier);
    }

    protected String bouclier;


    public Wizard(String name) {
        super(name);
        setName(name);
        setPointLife(6);
        setAttackStrength(15);
        setType("Wizard");
        this.weaponOff = new Sort("Flameche", 1);
        this.armour = new Philtre("Potion", 1);
    }

    @Override
    public String toString() {
        return "Les stats de votre personnage:  \n" +
                "\nVotre nom : " + getName() + "\n" +
                "classe :" + getType() + " \n" +
                "Point de vie : " + getPointLife() + "\n" +
                "Force d'attaque : " + getAttackStrength() + "\n" +
                "\nWeapon Offensive" + weaponOff.getName() + "\n" +
                "\nArmour" + armour.getName() + "\n";
    }
}
