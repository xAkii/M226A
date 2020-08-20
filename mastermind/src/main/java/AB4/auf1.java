package AB4;

import java.util.Arrays;
import java.util.Random;

public class auf1 {
    public static void main(String[] args) {
        int[] Array = new int[49];


        for(int i = 0; i < 29; i++ ){
            Random ZUFALL = new Random();
            int anzahlX = ZUFALL.nextInt(50) + 1;
            Array[i] = anzahlX;
        }
        Arrays.sort(Array);
        System.out.println(Arrays.toString(Array));
    }
}
