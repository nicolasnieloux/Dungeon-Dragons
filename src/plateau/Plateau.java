package plateau;

import bonus.Potion;
import character.equipment.offensive.Arme;
import enemy.Enemy;

import java.util.ArrayList;

public class Plateau {


    public ArrayList<Case> getBoard() {
        ArrayList<Case> slot = new ArrayList<>();

        slot.add(new EmptyCase());
        slot.add(new Potion(5));
        slot.add(new Enemy("Ennemy"));
        slot.add(new Potion(15));
        slot.add(new Arme("hache en mousse", 2));


        slot.add(new EmptyCase());
        slot.add(new Potion(5));
        slot.add(new Enemy("Ennemy"));
        slot.add(new Potion(15));
        slot.add(new Arme("hache en mousse", 2));

        slot.add(new EmptyCase());
        slot.add(new Potion(5));
        slot.add(new Enemy("Ennemy"));
        slot.add(new Potion(15));
        slot.add(new Arme("hache en mousse", 2));

        slot.add(new EmptyCase());
        slot.add(new Potion(5));
        slot.add(new Enemy("Ennemy"));
        slot.add(new Potion(15));
        slot.add(new Arme("hache en mousse", 2));

        slot.add(new EmptyCase());
        slot.add(new Potion(5));
        slot.add(new Enemy("Ennemy"));
        slot.add(new Potion(15));
        slot.add(new Arme("hache en mousse", 2));

        slot.add(new EmptyCase());
        slot.add(new Potion(5));
        slot.add(new Enemy("Ennemy"));
        slot.add(new Potion(15));
        slot.add(new Arme("hache en mousse", 2));

        slot.add(new EmptyCase());
        slot.add(new Potion(5));
        slot.add(new Enemy("Ennemy"));
        slot.add(new Potion(15));
        slot.add(new Arme("hache en mousse", 2));

        slot.add(new EmptyCase());
        slot.add(new Potion(5));
        slot.add(new Enemy("Ennemy"));
        slot.add(new Potion(15));
        slot.add(new Arme("hache en mousse", 2));

        slot.add(new EmptyCase());
        slot.add(new Potion(5));
        slot.add(new Enemy("Ennemy"));
        slot.add(new Potion(15));
        slot.add(new Arme("hache en mousse", 2));

        slot.add(new EmptyCase());
        slot.add(new Potion(5));
        slot.add(new Enemy("Ennemy"));
        slot.add(new Potion(15));
        slot.add(new Arme("hache en mousse", 2));

        slot.add(new EmptyCase());
        slot.add(new Potion(5));
        slot.add(new Enemy("Ennemy"));
        slot.add(new Potion(15));
        slot.add(new Arme("hache en mousse", 2));

        slot.add(new EmptyCase());
        slot.add(new Potion(5));
        slot.add(new Enemy("Ennemy"));
        slot.add(new Potion(15));
        slot.add(new Arme("hache en mousse", 2));

        slot.add(new EmptyCase());
        slot.add(new Potion(5));
        slot.add(new Enemy("Ennemy"));
        slot.add(new Potion(15));


        return slot;


//        slot.get(2).interract();
//        for (Case c:slot){
//            c.interract();
//        }
    }


}
