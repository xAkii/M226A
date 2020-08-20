package AB03;

import java.util.Random;

public class c {
    public static void main(String[] args) {


        String Array[]= new String[10];

        int c = Array.length;
        int e = 0;
        int r = 0;

                for ( int i = 0; r < 10; i++) {
                    Random ZUFALL = new Random();
                    int anzahlX = ZUFALL.nextInt(4) + 1;

                    int b = anzahlX;
                    int d = c / b;
                    e = 0;
                    for(i= 0;i<b ;i++ ){

                        Array[e] = "X";
                        e=e+d;
                    }
                        r = r + 1;
                        System.out.println("Zeile " + r + ": Zufallszahl: " + anzahlX + " " + java.util.Arrays.toString(Array));

                    for (int a = 0; a < 10; a++) {
                        Array[a] = "O";
                    }
                }


        }
    }

