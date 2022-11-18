package bonus;

import plateau.Case;

public class Potion implements Case {

    //Attributs
    public int soin;

    public Potion(int soin) {
        this.soin = soin;
    }

    @Override
    public void interract() {

        if (soin == 5) {
            System.out.println("Vous avez trouvé une grande potion");
        } else {
            System.out.println("Vous avez trouvé une petite potion");
        }
    }
}
