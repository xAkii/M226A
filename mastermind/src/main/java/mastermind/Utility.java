package mastermind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utility {
    private final static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));


    public static void printRules(){

        String rules = "Willkommen bei Mastermind, das ist ein Code-Knacker-SPiel. Das Ziel ist es gegen ein Spieler oder die AI den richtigen Code zu erraten.\n"
                + "Es gibt verschiedene Spielmodi. Sie müssen 4 Farben von 6 in der richtige Postion erraten. Vorsicht doppelte Farben sind erlaubt!\n" +
                "Rote Pins bedeuten: richtige Farbe, richtige Postion! \n" +
                "Weisse Pins bedeuten richtige Farbe, falsche Postion! ";
        System.out.println(rules);
    }


    public static Gameboard initGame() throws IOException, ColorNotFoundException{
        Gameboard game = null;
        int codeLength;
        boolean AI;
        StringBuilder menu = new StringBuilder();
        menu.append("------------------------\n");
        menu.append("|        MENU          |\n");
        menu.append("|----------------------|\n");
        menu.append("|   1) Spieler vs AI   |\n");
        menu.append("|----------------------|\n");
        menu.append("|   2) Ende            |\n");
        menu.append("------------------------\n");
        System.out.println(menu.toString());

        int choose = askForInteger("Wähle: ",1,3);
        if(choose != 3){
            if(choose == 2){
                printColorsMenu();
                Code code = askForCode(4);
                game = new Gameboard(code);
            }else{
                game = new Gameboard();
            }
        }

        return game;
    }

    public static Code askForCode(int length) throws IOException, ColorNotFoundException{
        Code code;
        boolean valid;
        do{
            valid = true;
            code = new Code();
            String stringCode = askForString("Wähle[R,G,B,Y,W,S]: ",length);
            for(int i=0;i<length && valid;i++){
                try {
                    code.addPeg(new Peg(Colors.getColor(stringCode.charAt(i))));
                } catch (ColorNotFoundException e) {
                    System.out.println(e.getMessage());
                    valid = false;
                }
            }
            //if(!valid) System.err.println("Your code is not valid, try again");
        }while(!valid);
        return code;
    }


    private static String askForString(String message,int length) throws IOException{
        boolean valid = false;
        String s = "";
        do{
            System.out.print(message);
            s = buffer.readLine();
            if(s.length()==length) valid = true;
            else System.err.println("Code muss eine Länge von:  "+length);
        }while(!valid);

        return s;
    }



    private static int askForInteger(String message,int min,int max) throws IOException{
        int choose=-1;
        boolean validate = false;
        do{
            try {
                System.out.print(message);
                choose = Integer.parseInt(buffer.readLine());
                if(choose>=min && choose<=max)validate = true;
                else System.err.println("[*] Deine Eingabe muss " + min +" und " + max + "Versuch es erneut");

            } catch (NumberFormatException e) {
                System.err.println("[*] Deine Eingabe ist keine Nummer");
            }
        }while(!validate);


        return choose;
    }


    private static char askForChar(String message,char values[]){
        char choose = 0;
        boolean validate = false;
        do{
            try{
                System.out.print(message);
                choose = buffer.readLine().toLowerCase().charAt(0);
                for(char temp : values){
                    if(choose == temp) validate = true;
                }
                if(!validate) System.err.println("[*] Ungültige Eingabe, Versuch es erneut");
            }catch(IOException e){
                System.err.println("[*] Deine Eingabe ist kein Char-typ");
            }
        }while(!validate);

        return choose;
    }

    private static void printColorsMenu(){
        System.out.print("[*] Die auswählbaren Farben: ");
        for(Colors temp :  Colors.values()){
            if(temp!=Colors.None) System.out.print(temp.name() + " ");
        }
        System.out.println();
    }


    public static void printInteger(String message,int integerToDisplay){
        System.out.println(message + integerToDisplay);
    }


    public static void clearConsole(){
        System.out.print("\033[H\033[2J");
    }


    public static boolean restartGame(){
        boolean restart = false;
        char choose = askForChar("[*] Erneut?[y,n]: ", new char[]{'y','n'});
        if(choose == 'y') restart = true;
        return restart;
    }


    static void displayGuessResult(String message,GuessResult result) {
        System.out.println(message + result.toString());
    }


    static void displayCode(String message,Code code){
        System.out.println(message + code.toString());

    }


    static void displayWinMessage(String player) {
        String message = player +" Gewonnen";
        String delimiter  = "";
        StringBuilder output = new StringBuilder();
        for(int i=0;i<message.length()+10;i++){
            delimiter+="-";
        }
        output.append(delimiter).append("\n");
        output.append(String.format("%s%"+(delimiter.length()-1)+"s%n","|","|"));
        output.append(String.format("%s %s%"+(delimiter.length()-message.length()-2)+"s%n","|",message,"|"));
        output.append(String.format("%s%"+(delimiter.length()-1)+"s%n","|","|"));
        output.append(delimiter).append("\n");

        System.out.println(output);


    }


    static void displayFailMessage(String player) {
        String message = "OH,NO " +player +" Leider Verloren";
        String delimiter  = "";
        StringBuilder output = new StringBuilder();
        for(int i=0;i<message.length()+10;i++){
            delimiter+="-";
        }
        output.append(delimiter).append("\n");
        output.append(String.format("%s%"+(delimiter.length()-1)+"s%n","|","|"));
        output.append(String.format("%s %s%"+(delimiter.length()-message.length()-2)+"s%n","|",message,"|"));
        output.append(String.format("%s%"+(delimiter.length()-1)+"s%n","|","|"));
        output.append(delimiter).append("\n");

        System.out.println(output);
    }


    static void exitMessage(){
        String message = "Danke fürs Spielen";
        String delimiter  = "";
        StringBuilder output = new StringBuilder();
        for(int i=0;i<message.length()+10;i++){
            delimiter+="-";
        }
        output.append(delimiter).append("\n");
        output.append(String.format("%s%"+(delimiter.length()-1)+"s%n","|","|"));
        output.append(String.format("%s %s%"+(delimiter.length()-message.length()-2)+"s%n","|",message,"|"));
        output.append(String.format("%s%"+(delimiter.length()-1)+"s%n","|","|"));
        output.append(delimiter).append("\n");

        System.out.println(output);
    }

}