package save;

import character.player.Character;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class DbCharacter implements CharacterPersistence {

    private DbAccess db = DbAccess.getInstance();

    @Override
    public Map<Integer, Character> loadAll()  {
        ResultSet data = db.selectHeroList();

        try {
            return CharacterDbFactory.createCharacterList(data);
        } catch (Exception e) {
            return new HashMap<>();
        }
    }

    @Override
    public Character loadCharacter(int id) throws SQLException {
        ResultSet data = db.selectHero(id);
        return CharacterDbFactory.createCharacter(data);
    }

    @Override
    public void save(Character c) {
        db.save(c);
    }

    @Override
    public void update(Character c, int id) {
        db.update(c, id);
    }

    @Override
    public void remove(int id) {
        db.removeHero(id);
    }
}
