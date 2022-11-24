package plateau;

import bonus.*;
import character.player.Character;
import enemy.Dragon;
import enemy.Gobelin;
import enemy.Sorcier;
import game.PersonnageHorsPlateauException;

import java.util.ArrayList;
import java.util.Objects;

public class Plateau {
    int nbCase=64;
    public ArrayList<Case> getBoardFixe() {
        ArrayList<Case> slot = new ArrayList<>();
        int nbCase = 64;
        for (int i = 0; i <= nbCase; i++) {
            switch (i) {
                case 45, 52, 56, 62 -> slot.add(new Dragon());
                case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47 -> slot.add(new Sorcier());
                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 -> slot.add(new Gobelin());
                case 2, 11, 5, 22, 38 -> slot.add(new Massue());
                case 19, 26, 42, 53 -> slot.add(new Epee());
                case 1, 4, 8, 17, 23 -> slot.add(new Eclair());
                case 48, 49 -> slot.add(new Fireball());
                case 7, 13, 31, 33, 39, 43 -> slot.add(new Potion());
                case 28, 41 -> slot.add(new PotionBig());
                default -> slot.add(new EmptyCase());
            }

        }
        return slot;
    }


    public ArrayList<Case> getBoardRandom(){
        ArrayList<Case> slot = new ArrayList<>();

        int dragon =4;
        int sorcier =10;
        int gobelin=10;

        int massue =5;
        int epee=4;
        int eclair=5;
        int bouleDeFeu=2;
        int potion=6;
        int bigPotion=2;

        for (int i=0;i< nbCase;i++){
            slot.add(i, new EmptyCase());
        }

        while (dragon>0){
            int index = (int) (Math.random() * nbCase-1 );
            if (slot.get(index) instanceof EmptyCase){
                slot.set(index, new Dragon());
                dragon--;
            }
        }
        while (sorcier>0){
            int index = (int) (Math.random() * nbCase-1);
            if (slot.get(index) instanceof EmptyCase){
                slot.set(index, new Sorcier());
                sorcier--;
            }
        }

        while (gobelin>0){
            int index = (int) (Math.random() * nbCase-1 );
            if (slot.get(index) instanceof EmptyCase){
                slot.set(index, new Gobelin());
                gobelin--;
            }
        }
        while (massue>0){
            int index = (int) (Math.random() * nbCase-1 );
            if (slot.get(index) instanceof EmptyCase){
                slot.set(index, new Massue());
                massue--;
            }
        }

        while (epee>0){
            int index = (int) (Math.random() * nbCase-1 );
            if (slot.get(index) instanceof EmptyCase){
                slot.set(index, new Epee());
                epee--;
            }
        }

        while (eclair>0){
            int index = (int) (Math.random() * nbCase-1 );
            if (slot.get(index) instanceof EmptyCase){
                slot.set(index, new Eclair());
                eclair--;
            }
        }
        while (bouleDeFeu>0){
            int index = (int) (Math.random() * nbCase-1 );
            if (slot.get(index) instanceof EmptyCase){
                slot.set(index, new Fireball());
                bouleDeFeu--;
            }
        }

        while (potion>0){
            int index = (int) (Math.random() * nbCase-1);
            if (slot.get(index) instanceof EmptyCase){
                slot.set(index, new Potion());
                potion--;
            }
        }

        while (bigPotion>0){
            int index = (int) (Math.random() * nbCase-1 );
            if (slot.get(index) instanceof EmptyCase){
                slot.set(index, new PotionBig());
                bigPotion--;
            }
        }

        return slot;
    }


    public int okValidateMove(Character p, int dice) throws PersonnageHorsPlateauException {

        int pos = p.getPosition() + dice;
        if (pos > nbCase) {
            throw new PersonnageHorsPlateauException();

        }
        p.setPosition(p.getPosition() + dice);
        return p.getPosition();

    }
}
