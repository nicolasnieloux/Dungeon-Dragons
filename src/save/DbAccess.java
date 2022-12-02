package save;

import character.player.Character;

import java.sql.*;


public class DbAccess {

    private static DbAccess instance = null;
    Connection con;


    /*
     * La présence d'un constructeur privé supprime
     * le constructeur public par défaut.
     */
    private DbAccess() {
        final String url = "jdbc:mysql://localhost:3306/d&d";
        final String userName = "root";
        final String password = "";

        try {
            con = DriverManager.getConnection(url, userName, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static DbAccess getInstance() {
        if (instance == null)
            instance = new DbAccess();
        return instance;
    }


//    public void getHero() {
//        final String QUERY = "SELECT * FROM hero";
//        Statement stmt;
//        ResultSet rs;
//        try {
//            stmt = con.createStatement();
//            rs = stmt.executeQuery(QUERY);
//            while (rs.next()) {
//                System.out.print("ID: " + rs.getInt("id"));
//                System.out.print(", Nom: " + rs.getString("nom"));
//                System.out.print(", Type: " + rs.getString("type"));
//                System.out.println(", Niveau de vie: " + rs.getInt("niveauVie"));
//                System.out.println(", Niveau de force: " + rs.getInt("niveauForce"));
//                System.out.println(", Arme/Sort: " + rs.getString("armeSort"));
//                System.out.println(", Bouclier: " + rs.getString("bouclier"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//    }

    public void save(Character c) {

        final String QUERY = "INSERT INTO hero (nom, type, niveauVie, niveauForce, armeSort,bouclier ) VALUES (?, ?, ?, ?,?, ?)";
//                + c.getName() + "', '"
//                + c.getType() + "', '"
//                + c.getPointLife() + "', '"
//                + c.getAttackStrength() + "', '"
//                + c.getWeaponOff().getName() + "', '"
//                + c.getArmour().getName() + "')";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(QUERY);
            stmt.setString(1, c.getName());
            stmt.setString(2, c.getType());
            stmt.setInt(3, c.getPointLife());
            stmt.setInt(4, c.getAttackStrength());
            stmt.setString(5, c.getWeaponOff().getName());
            stmt.setString(6, c.getArmour().getName());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void removeHero(int heroIndex) {
        final String QUERY = "DELETE FROM hero" + " WHERE id= ?";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(QUERY);
            stmt.setInt(1, heroIndex);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet selectHero(int id) {
        final String QUERY = "SELECT * FROM hero WHERE id = ?";
        PreparedStatement stmt1;

        try {
            stmt1 = con.prepareStatement(QUERY);
            stmt1.setInt(1, id);
            return stmt1.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public ResultSet selectHeroList() {
        final String QUERY = "SELECT * FROM hero";
        PreparedStatement stmt2;
        try {
            stmt2 = con.prepareStatement(QUERY);
            return stmt2.executeQuery(QUERY);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void update(Character c, int id) {
        final String QUERY = "UPDATE hero SET nom = ?, type = ?, niveauVie = ?, niveauForce = ?,armeSort = ?, bouclier=? WHERE id=?";


        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(QUERY);

            stmt.setString(1, c.getName());
            stmt.setString(2, c.getType());
            stmt.setInt(3, c.getPointLife());
            stmt.setInt(4, c.getAttackStrength());
            stmt.setString(5, c.getWeaponOff().getName());
            stmt.setString(6, c.getArmour().getName());
            stmt.setInt(7, id);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

