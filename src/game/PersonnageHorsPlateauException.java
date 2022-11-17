package game;

public class PersonnageHorsPlateauException extends Exception {

    public PersonnageHorsPlateauException() {
    }

    @Override
    public String toString() {
        return "Le personnage est sorti du plateau!!!! MOUAHAHAHAHA";
    }
}
