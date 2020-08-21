package mastermind;

import java.io.IOException;
import static mastermind.Utility.*;

public class Mastermind {


    public static void main(String[] args) throws IOException, ColorNotFoundException {
        boolean restart = false;
        printRules();
        do{
            Gameboard gameboard = initGame();
            if(gameboard != null){
                gameboard.play();
                restart = restartGame();
                clearConsole();
            } else restart = false;
        }while(restart);

        exitMessage();
    }

}