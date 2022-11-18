package enemy;

import plateau.Case;

import java.util.Objects;

public class Enemy implements Case {

    String name;

    public Enemy(String name) {
        this.name = name;
    }

    @Override
    public void interract() {

        if (Objects.equals(name, "Christophe")) {
            System.out.println("Bah ouai, c'est une parenthèse");
        } else {
            System.out.println("Un ennemi est devant vous!!!");
        }
    }
}