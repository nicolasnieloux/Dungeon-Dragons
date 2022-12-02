package save;

import character.player.Character;
import character.player.Warrior;
import character.player.Wizard;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class CharacterDbFactory {


    public static Character createCharacter(ResultSet data) throws SQLException {

//
        String type = data.getString("type");
        Character current;

        current = switch (type) {
            case "Warrior" ->
                    new Warrior(data.getString("nom"), data.getString("type"), data.getInt("niveauVie"), data.getInt("niveauForce"), data.getString("armeSort"), data.getString("bouclier"));
            case "Wizard" ->
                    new Wizard(data.getString("nom"), data.getString("type"), data.getInt("niveauVie"), data.getInt("niveauForce"), data.getString("armeSort"), data.getString("bouclier"));
            default -> null;
        };
        return current;
    }


    public static Map<Integer, Character> createCharacterList(ResultSet data) throws SQLException {
        Map<Integer, Character> result = new HashMap<>();

        while (data.next()) {
            Character current = createCharacter(data);
            int id = data.getInt("id");
            result.put(id, current);
        }

        return result;
    }


}
