package enemy;

import bonus.Massue;
import game.Game;
import plateau.Case;
import character.player.Character;
import menu.Menu;
import plateau.Cementary;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


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
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nVous recontrez un " + getName());
        System.out.println("\nVous pouvez perdre " + getAttackStrength() + " points de vie");

        System.out.println("-----------------------------");
        System.out.println("Combattez ou fuir?????");
        System.out.println("-----------------------------");

        System.out.println("Press enter to continue");

        keyboard.nextLine();

        int pointLifeEnemy = getPointLife();
        int pointLife = c.getPointLife();


        do {
            String actionOraction = Menu.escapeOrFight();
            if (Objects.equals(actionOraction, "1")) {

                System.out.println("Point de vie avant combat ennemi: " + getPointLife());
                System.out.println("Point d'attaque ennemi: " + getAttackStrength());

                System.out.println("Vous attaquez l'ennemi");
                pointLifeEnemy -= c.getAttackStrength();
                setPointLife(pointLifeEnemy);

                System.out.println("Point de vie de l'enemi : " + pointLifeEnemy);

                System.out.println("Press enter to continue");
                keyboard.nextLine();

                if (pointLifeEnemy <= 0) {
                    System.out.println("Ennemi tué!! GG");


                } else {
                    System.out.println(("Enemi touché"));
                    System.out.println(("Enemi vous contre-attaque"));
                    System.out.println(("Vous perdez " + getAttackStrength() + "points de vie"));

                    System.out.println("Press enter to continue");
                    keyboard.nextLine();

                    pointLife -= getAttackStrength();
                    c.setPointLife(pointLife);

                }
            } else {
                int positionPlayer = c.getPosition();
                int de = 10;
                positionPlayer -= de;
                c.setPosition(positionPlayer);
                System.out.println("Vous reculez de " + de + " cases");
                if (positionPlayer <= 0) {
                    c.setPosition(0);
                }
                System.out.println("Votre position est " + c.getPosition() + "/64");

                break;
            }
        }
        while (pointLifeEnemy > 0 && pointLife > 0);
    }
}


