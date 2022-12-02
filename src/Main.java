import game.Game;
import game.PersonnageHorsPlateauException;

import java.sql.*;

import static com.mysql.cj.util.SaslPrep.StringType.QUERY;

public class Main {
    public static void main(String[] args) throws PersonnageHorsPlateauException, SQLException {

//         Connexion BDD
//        game.Singleton s1 = game.Singleton.getInstance();
//     s1.selectHero(1);
////s1.addHero("aaaaaa", "bbbbb",1,4,"ccccc", "ddddd");
////s1.removeHero(5);


        // Lancement de la partie
        Game test = new Game();
        test.playGame();
    }
}

