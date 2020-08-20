package AB05;

import java.util.Scanner;

public class a {
    public static  int calc (int operand1, int operand2, int operator){
        int ergebnis = 0;
        switch (operator) {
            case 1:
                ergebnis = operand1 + operand2;
                break;
            case 2:
                ergebnis = operand1 - operand2;
                break;
            case 3:
                ergebnis = operand1 * operand2;
                break;
            case 4:
                ergebnis = operand1 / operand2;
                break;
            case 5:
                ergebnis = operand1 % operand2;
                break;
            default:
                System.out.println("Ihre Eingabe war ungültig.");

                return ergebnis;
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Geben Sie den ersten Operanten ein: ");

        int para = a.nextInt();

        Scanner b = new Scanner(System.in);
        System.out.println("Geben Sie den zweiten Operanten ein: ");

        int parb = b.nextInt();

        Scanner c = new Scanner(System.in);
        System.out.println("Geben sie den ein Operartor ein : " + "\n" +
                            "1 für Addition" + "\n" +
                            "2 für Subtraktion" + "\n" +
                            "3 für Multiplikation" + "\n" +
                            "4 für Division" + "\n" +
                            "5 für dem Rest.");

        int parc = c.nextInt();

        System.out.println("Ihr Ergebis lautet: " + calc(para, parb, parc));


    }
}
