package AB4;

import java.util.Arrays;
import java.util.Random;

public class b {
    public static void main(String[] args) {
        int zeilen = 6, seiten = 3, spalten = 4;
        int[][][] myarray3 = new int[zeilen][seiten][spalten]; // Ein Array mit 3 Dimensionen
        Random ZUFALL = new Random();
        int anzahlX = ZUFALL.nextInt(10) + 20;

        myarray3[0] [0] [0] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[0] [1] [0] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[0] [2] [0] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[1] [0] [0] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[1] [1] [0] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[1] [2] [0] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[2] [0] [0] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[2] [1] [0] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[2] [2] [0] = anzahlX;

        myarray3[0] [0] [1] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[0] [1] [1] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[0] [2] [1] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[1] [0] [1] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[1] [1] [1] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[1] [2] [1] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[2] [0] [1] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[2] [1] [1] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[2] [2] [1] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;

        myarray3[0] [0] [2] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[0] [1] [2] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[0] [2] [2] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[1] [0] [2] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[1] [1] [2] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[1] [2] [2] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[2] [0] [2] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[2] [1] [2] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;
        myarray3[2] [2] [2] = anzahlX;
        anzahlX = ZUFALL.nextInt(10) + 20;

        for (int i = 0; i < seiten; i++)                // 3.) zum Schluß die Seiten
        {
            for (int j = 0; j < zeilen; j++)            // 2.) dann die Zeilen
            {
                for (int k = 0; k < spalten; k++)       // 1.) Zuerst die Spalten
                {
                    System.out.println(Arrays.deepToString(myarray3));
                }
                System.out.println("\n");    // Zeilenumbruch bei Beginn einer neuen Zeile
            }
            System.out.println("\n");        // Zeilenumbruch bei Beginn einer neuen Seite
        }
    }
}
