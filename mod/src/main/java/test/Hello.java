package test;

public class Hello {
    public static void main(String[] args){
        System.out.println("Hello World");

        int zahl1 = 10;
        int zahl2 = 20;
        int ergebenis;

        String string1 = "blablablaba";
        String string2 = "25";

        int zahl3 = Integer.parseInt(string2);

        ergebenis = zahl1 + zahl2;

        System.out.println(string1);

        System.out.println("Gebe Zahl1 aus " + zahl1);
        System.out.println(("Zahl1 + Zahl2 = " + (zahl1+zahl2)));
        System.out.println("Das Ergebnis ist: " + ergebenis);
        System.out.println("String als Integer " + zahl3);
    }
}
