package Aufgabe;

public class Stern {
    public static void main(String[] args) {
        char stern = '*';
        String sternchen = "*";

        for(int i=0; i<8; i++)
        {
            System.out.println(sternchen);
            sternchen = sternchen + stern;
        }
    }
}
