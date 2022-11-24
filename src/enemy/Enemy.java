package enemy;

import plateau.Case;
import character.player.Character;


public class Enemy implements Case {


    protected String name;
    protected int pointLife;
    protected int attackStrength;


    public Enemy(String name, int pointLife, int attackStrength) {
        this.name = name;
        this.pointLife = pointLife;
        this.attackStrength = attackStrength;
    }

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

    @Override
    public String toString() {
        return "Les stats de l'enemi: " +
                "\nname: " + name + '\'' +
                "\npointLife : " + pointLife +
                "\nattackStrength : " + attackStrength;
    }

    @Override
    public void interract(Character c) {

        System.out.println("\nVous recontrez un " + getName());
        System.out.println("\nVous perdez " + getAttackStrength() + " points de vie");

        int pointLife = c.getPointLife();
        pointLife -= getAttackStrength();
        c.setPointLife(pointLife);

    }
}
