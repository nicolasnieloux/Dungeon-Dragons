package plateau;

import bonus.Potion;
import character.equipment.offensive.Arme;
import character.player.Character;
import enemy.Enemy;
import game.PersonnageHorsPlateauException;

import java.util.ArrayList;

public class Plateau {
    ArrayList<Case> slot = new ArrayList<>();

    public ArrayList<Case> getBoard() {


        slot.add(new EmptyCase());
        slot.add(new Potion(5));
//        slot.add(new Enemy("Ennemy"));
        slot.add(new Potion(15));
        slot.add(new Arme("hache en mousse", 2));


        slot.add(new EmptyCase());
        slot.add(new Potion(5));
//        slot.add(new Enemy("Ennemy"));
        slot.add(new Potion(15));
        slot.add(new Arme("hache en mousse", 2));

        slot.add(new EmptyCase());
        slot.add(new Potion(5));
//        slot.add(new Enemy("Ennemy"));
        slot.add(new Potion(15));
        slot.add(new Arme("hache en mousse", 2));

//        slot.add(new EmptyCase());
//        slot.add(new Potion(5));
//        slot.add(new Enemy("Ennemy"));
//        slot.add(new Potion(15));
//        slot.add(new Arme("hache en mousse", 2));
//
//        slot.add(new EmptyCase());
//        slot.add(new Potion(5));
//        slot.add(new Enemy("Ennemy"));
//        slot.add(new Potion(15));
//        slot.add(new Arme("hache en mousse", 2));
//
//        slot.add(new EmptyCase());
//        slot.add(new Potion(5));
//        slot.add(new Enemy("Ennemy"));
//        slot.add(new Potion(15));
//        slot.add(new Arme("hache en mousse", 2));
//
//        slot.add(new EmptyCase());
//        slot.add(new Potion(5));
//        slot.add(new Enemy("Ennemy"));
//        slot.add(new Potion(15));
//        slot.add(new Arme("hache en mousse", 2));
//
//        slot.add(new EmptyCase());
//        slot.add(new Potion(5));
//        slot.add(new Enemy("Ennemy"));
//        slot.add(new Potion(15));
//        slot.add(new Arme("hache en mousse", 2));
//
//        slot.add(new EmptyCase());
//        slot.add(new Potion(5));
//        slot.add(new Enemy("Ennemy"));
//        slot.add(new Potion(15));
//        slot.add(new Arme("hache en mousse", 2));
//
//        slot.add(new EmptyCase());
//        slot.add(new Potion(5));
//        slot.add(new Enemy("Ennemy"));
//        slot.add(new Potion(15));
//        slot.add(new Arme("hache en mousse", 2));
//
//        slot.add(new EmptyCase());
//        slot.add(new Potion(5));
//        slot.add(new Enemy("Ennemy"));
//        slot.add(new Potion(15));
//        slot.add(new Arme("hache en mousse", 2));
//
//        slot.add(new EmptyCase());
//        slot.add(new Potion(5));
//        slot.add(new Enemy("Ennemy"));
//        slot.add(new Potion(15));
//        slot.add(new Arme("hache en mousse", 2));
//
//        slot.add(new EmptyCase());
//        slot.add(new Potion(5));
//        slot.add(new Enemy("Ennemy"));
//        slot.add(new Potion(15));


        return slot;

    }

public int okValidateMove (Character p,int dice ) throws PersonnageHorsPlateauException {

        int pos=p.getPosition()+dice;
        if (pos > slot.size()){
    throw new PersonnageHorsPlateauException();

        }
    p.setPosition(p.getPosition()+dice);
   return p.getPosition();

}
}
