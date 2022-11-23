package enemy;

import plateau.Case;
import character.player.Character;

import java.util.Objects;

public class Enemy implements Case {

    protected String name;
    protected int pointLife;
    protected int attackStrength;


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
        return "Enemy{" +
                "name='" + name + '\'' +
                ", pointLife=" + pointLife +
                ", attackStrength=" + attackStrength +
                '}';
    }

    @Override
    public void interract(Character c) {


    }
}

//        if (Objects.equals(name, "Christophe")) {
//            System.out.println("Bah ouai, c'est une parenthèse");
//            int pointLife= c.getPointLife();
//            pointLife -=5;
//            c.setPointLife(pointLife);
//
//
//        } else {
//            System.out.println("Un ennemi est devant vous!!!");
//        }
//    }