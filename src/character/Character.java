package character;

public class Character {

    //Attributes
    private String name;
    private String type;

    private int pointLife;
    private int attackStrength;


    //Constructors
    public Character() {
    }

    public Character(String name)
    {
        this.name = name;
    }

    public Character(String name, String type) {
        this.name = name;
        this.type = type;
    }


    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPointLife() {
        return pointLife;
    }

    public void setPointLife(int pointLife) {
        this.pointLife = pointLife;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }


    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", pointLife=" + pointLife +
                ", attackStrength=" + attackStrength +
                '}';
    }



}
