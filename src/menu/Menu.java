package menu;

import character.Character;
import character.equipment.DefensiveEquipment;
import character.equipment.OffensiveEquipment;

import java.util.Objects;
import java.util.Scanner;


public class Menu {
    String nameCharacter;
    String typeCharacter;
    Character character;
    OffensiveEquipment weaponOff;
    DefensiveEquipment  weaponDef;

    public void printMainMenu() {

        String choice;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Création de personnage (1) ou quitter la partie (2) ?");
        choice = keyboard.nextLine();
        if (choice.equals("1")) {
            System.out.println("Bienvenue dans le jeu D&D");

            do {
                createOrModify();
                displayCharacter(character, weaponOff, weaponDef);

            } while (validateChoice() == false);

        } else if (choice.equals("2")) {
            System.out.println("alors on veut arreter");
            System.exit(0);
        } else {
            printMainMenu();
        }
    }


    public String askName() {
        String name;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Quel est le nom de votre personnage) ?");
        name = keyboard.nextLine();
        return (name);
    }

    public String askType() {
        String response;
        String type;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Choisissez votre personnage ?");
        System.out.println("Warrior (1) - Wizard (2)");
        response = keyboard.nextLine();

        switch (response) {
            case "1" -> type = "Warrior";
            case "2" -> type = "Wizard";
            default -> type = askType();
        }
        return (type);
    }

    public void displayCharacter(Character charact, OffensiveEquipment weaponOff, DefensiveEquipment weaponDef) {
        System.out.println("Résumons votre choix: ");
        System.out.println("Votre nom : " + charact.getName());
        System.out.println("Votre type : " + charact.getType());
        System.out.println("Point de vie : " + charact.getPointLife());
        System.out.println("Force d'attaque : " + charact.getAttackStrength());
        System.out.println("Type d'arme : " + weaponOff.getType());
        System.out.println("Nom de l'arme : " + weaponOff.getName());
        System.out.println("Niveau d'attaque : " + weaponOff.getAttackLevel());
        System.out.println("Type de défense : " + weaponDef.getType());
        System.out.println("Nom de la défense : " + weaponDef.getName());
        System.out.println("Niveau de défense : " + weaponDef.getDefenseLevel());

    }

    public Boolean validateChoice() {
        String choice;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Voulez-vous valider (1) ou  modifier votre personnage (2)");
        choice = keyboard.nextLine();
        if (choice.equals("1")) {
            System.out.println("Votre personnage est validé, c'est parti!!!");
            return true;
        } else if (choice.equals("2")) {
            System.out.println("Reprenons alors au début");
            return false;
        } else {
            return false;
        }
    }


    public void setPlayerPoint(String typeCharacter) {
        if (Objects.equals(typeCharacter, "Warrior")) {
            character.setPointLife(10);
            character.setAttackStrength(10);
        } else {
            character.setPointLife(6);
            character.setAttackStrength(15);
        }
    }

    public void setOffensiveWeapon(String typeCharacter) {
        weaponOff = new OffensiveEquipment();
        if (Objects.equals(typeCharacter, "Warrior")) {
            weaponOff.setName("épée en mousse");
            weaponOff.setType("Arme");
            weaponOff.setAttackLevel(1);

        } else {
            weaponOff.setName("embrumation");
            weaponOff.setType("Sort");
            weaponOff.setAttackLevel(3);
        }
    }
    public void setDefensiveWeapon(String typeCharacter) {
        weaponDef = new DefensiveEquipment();
        if (Objects.equals(typeCharacter, "Warrior")) {
            weaponDef.setName("bouclier en mousse");
            weaponDef.setType("Bouclier");
            weaponDef.setDefenseLevel(2);

        } else {
            weaponDef.setName("Pluto");
            weaponDef.setType("Baton de Mickey");
            weaponDef.setDefenseLevel(5);
        }
    }

    public void createOrModify() {
        String nameCharacter = askName();
        String typeCharacter = askType();


        if (character != null) {
            character.setName(nameCharacter);
            character.setType(typeCharacter);
            setPlayerPoint(typeCharacter);
            setOffensiveWeapon(typeCharacter);
            setDefensiveWeapon(typeCharacter);
        } else {
            character = new Character(nameCharacter, typeCharacter);
            setPlayerPoint(typeCharacter);
            setOffensiveWeapon(typeCharacter);
            setDefensiveWeapon(typeCharacter);
        }
    }

}
