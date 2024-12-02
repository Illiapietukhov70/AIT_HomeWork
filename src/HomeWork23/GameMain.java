package HomeWork23;

import java.lang.reflect.Array;

public class GameMain {
    public static void main(String[] args) {

        GameCharacter[] gameCharacters = new GameCharacter[3];
        gameCharacters[0] = new Mage("Gandolf", "Magick");
        gameCharacters[1] = new Warrior("Arthur", "Sword");
        gameCharacters[2] = new Archer("Robin Hood", "Bow and arrow");

        for (GameCharacter gameCharacter: gameCharacters) {
            gameCharacter.attack();
        }



    }
}
