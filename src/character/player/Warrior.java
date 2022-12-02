package character.player;

import character.equipment.defensive.Bouclier;
import character.equipment.offensive.Arme;


public class Warrior extends Character {

    protected String name;
    protected String type;
//    protected int niveauVie;

//    protected int niveauForce;
    protected String armeSort;
    protected String bouclier;


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

//    public int getNiveauVie() {
//        return niveauVie;
//    }
//
//    public void setNiveauVie(int niveauVie) {
//        this.niveauVie = niveauVie;
//    }

//    public int getNiveauForce() {
//        return niveauForce;
//    }
//
//    public void setNiveauForce(int niveauForce) {
//        this.niveauForce = niveauForce;
//    }
//
//    public String getArmeSort() {
//        return armeSort;
//    }
//
//    public void setArmeSort(String armeSort) {
//        this.armeSort = armeSort;
//    }
//
//    public String getBouclier() {
//        return bouclier;
//    }
//
//    public void setBouclier(String bouclier) {
//        this.bouclier = bouclier;
//    }

    public Warrior(String name, String type, int pointLife, int attackStrength, String armeSort, String bouclier) {

        this.name=name;
        this.type = type;
        this.pointLife = pointLife;
        this.attackStrength = attackStrength;
        this.weaponOff = new Arme(armeSort);
        this.armour =new Bouclier(bouclier) ;
    }


    //Constructor
    public Warrior(String name) {
        super(name);
        setName(name);
        setPointLife(20);
        setType("Warrior");
        setAttackStrength(10);
        this.weaponOff = new Arme("Epee en mousse", 1);
        this.armour = new Bouclier("Bouclier en mousse", 1);
    }


    @Override
    public String toString() {
        return "\nLes stats de votre personnage: \n" +
                "\nVotre nom : " + getName() + "\n" +
                "classe :" + getType() + " \n" +
                "Point de vie : " + getPointLife() + "\n" +
                "Force d'attaque : " + getAttackStrength() + "\n" +
                "\nWeapon Offensive: " + weaponOff.getName() + "\n" +
                "\nArmour: " + armour.getName() + "\n";
    }
}
