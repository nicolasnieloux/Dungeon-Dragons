package save;

import character.player.Character;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public interface CharacterPersistence {

    Map<Integer, Character> loadAll() throws SQLException;

    Character loadCharacter (int id) throws SQLException;

    void save (Character c);


    void update (Character c, int id);

    void remove (int id);
}
