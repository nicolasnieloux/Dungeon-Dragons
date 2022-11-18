package plateau;

import bonus.Potion;
import character.equipment.offensive.Arme;
import enemy.Enemy;

import java.util.ArrayList;

public class Plateau {


    public void board() {

        ArrayList<Case> slot = new ArrayList<Case>();

        slot.add(new EmptyCase());
        slot.add(new Potion(5));
        slot.add(new Enemy("Christophe"));
        slot.add(new Potion(15));
        slot.add(new Arme("hache en mousse", 2));

        for (Case test:slot){
            test.interract();

        }
    }



}
