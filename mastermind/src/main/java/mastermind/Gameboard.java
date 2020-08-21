package mastermind;

import java.io.IOException;
import java.util.Random;


public class Gameboard {
    private final int codeLength = 4;
    private int attempt;
    private Code gameCode;
    private boolean win;
    private final int MAX_HUMAN_ATTEMPTS = 10;
    private final int MAX_AI_ATTEMPTS = 5;


    public Gameboard() {
        this.attempt = 1;
        this.gameCode = generateCode();
        this.win = false;
    }


    public Gameboard(Code code){
        this.gameCode = code;
        this.attempt = 1;
        this.win = false;
    }


    public Gameboard(Gameboard gameboard){
        this.attempt = gameboard.attempt;
        this.gameCode = gameboard.gameCode;
        this.win = gameboard.win;
    }


    public int getCodeLength() {
        return codeLength;
    }



    public int getAttempt() {
        return attempt;
    }


    private Code getGameCode() {
        return gameCode;
    }


    public void play() throws IOException, ColorNotFoundException{
        Utility.clearConsole();

            playUser();


        if(!win) Utility.displayCode("[*] Code: ", gameCode);

    }


    private Code generateCode(){
        Code c = new Code();
        int i=0;
        do{
            Peg randomPeg = new Peg(generateRandomColor());
            if(randomPeg.getColor()!=Colors.None) {
                c.addPeg(randomPeg);
                i++;
            }
        }while(i<this.codeLength);
        return c;
    }


    private Colors generateRandomColor(){
        Random random = new Random();
        return Colors.values()[random.nextInt(Colors.values().length)];
    }




    private void playUser() throws IOException, ColorNotFoundException{
        do{
            Utility.printInteger("Bestätige Nummer: ", attempt);
            Code guessCode = Utility.askForCode(this.codeLength);
            GuessResult result = checkCode(new Code(guessCode),new Code(this.gameCode));
            Utility.displayCode("Dein Versuch: ", guessCode);
            Utility.displayGuessResult("Ergebnis: ",result);
            if(result.isGuessed(this.codeLength)) this.win = true;
            this.attempt++;
        }while(!gameOver() && !isWin());
        if(win) Utility.displayWinMessage("Spieler");
        else Utility.displayFailMessage("Spieler");
    }


    public GuessResult checkCode(Code guess,Code code){
        GuessResult result = new GuessResult();
        result.setTotallyCorrect(totallyCorrect(guess,code));
        result.setOnlyValuesCorrect(onlyValuesCorrect(guess,code));
        return result;
    }


    private int totallyCorrect(Code guess,Code code){
        int count=0;
        for(int i=0;i<code.getCodeLength();i++){
            if(code.getPeg(i).equals(guess.getPeg(i))) {
                count++;
                guess.getPeg(i).setColor(Colors.None);
                code.getPeg(i).setColor(Colors.None);
            }
        }
        return count;
    }


    private int onlyValuesCorrect(Code guess,Code code){
        int count=0;
        for(Peg p : guess.getCode()){
            if(p.getColor() != Colors.None){
                int gameCodeIndex = code.contains(p);
                if(gameCodeIndex >= 0 && gameCodeIndex != guess.getPegIndex(p)) {
                    count ++;
                    p.setColor(Colors.None);
                    code.getPeg(gameCodeIndex).setColor(Colors.None);
                }
            }

        }
        return count;
    }


    public boolean gameOver(){
        return (this.attempt>(MAX_HUMAN_ATTEMPTS));
    }

    public boolean isWin(){
        return this.win;
    }

}