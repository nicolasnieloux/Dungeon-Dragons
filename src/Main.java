import character.player.Character;
import character.player.Warrior;
import game.Game;
import game.PersonnageHorsPlateauException;
import save.DbAccess;

import java.sql.*;

import static com.mysql.cj.util.SaslPrep.StringType.QUERY;

public class Main {
    public static void main(String[] args) throws PersonnageHorsPlateauException, SQLException {

//         Connexion BDD
//        game.Singleton s1 = game.Singleton.getInstance();
//     s1.selectHero(1);
//s1.addHero("aaaaaa", "bbbbb",1,4,"ccccc", "ddddd");
////s1.removeHero(5);


        // Lancement de la partie
//        Game test = new Game();
//        test.playGame();

  DbAccess test = DbAccess.getInstance();

        Character c = new Warrior("aa","wizarf",1,1,"zzzzz","gggg");
//        test.save(c);
//        test.update(c,25);
//        test.removeHero(24);
    }
    }

