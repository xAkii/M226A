package master;
import java.util.Random;
import java.util.Scanner;

public class mind {
    public static void main(String[] args) {
        System.out.println("Geben Sie einen Versuchcode mit vier Buchstaben aus der Menger (r,g,b,y,s,w ein: ");
        System.out.println("Spiel beendet. Geheimcode war xxxx. Anzahl Versuche: 5");

        char[] Array;

        Random ZUFALL = new Random();
        int anzahlX = ZUFALL.nextInt(5);

        Array= new char [4];

        Array[0]='s';
        Array[1]='r';
        Array[2]='g';
        Array[3]='y';
        Array[4]='w';
        Array[5]='b';

        System.out.println("__ __ __ __" + Array[anzahlX]);


/*
        Scanner Vermutung = new Scanner(System.in);
        int num = Vermutung.nextInt();

        boolean richtig = false;
        int versuchZähler=0;
        int Zähler=0;
        while(Zähler<9 || !richtig){
            if (Vermutung==Array) {

            } else {

            }
            Zähler++;
        }
*/



    }
}
