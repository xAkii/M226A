package Bank;

import java.util.Locale;

public class TestKonto {
    public static void main(String[] args) {

        Konto konto1 = new Konto();
        Konto konto2 = new Konto();

        double konto = 4000.00;
        double einzahlung = 500.75;
        double zinssatz = 1;
        int laufzeit = 365;
        double saldo;


        konto1.einzahlen(einzahlung, konto);

        konto1.verzinsen(zinssatz, laufzeit);

        System.out.println(konto1.getSaldo() + "Ihr Saldo von Konto 1 beträgt: " +String.format("%1.2f CHF", konto1.getSaldo()));

        konto = 4000.00;
        einzahlung = 720.50;
        laufzeit = 750;

        konto2.einzahlen(einzahlung, konto);

        konto2.verzinsen(zinssatz, laufzeit);

        System.out.println(konto2.getSaldo() + "Ihr Saldo von Konto 2 beträgt: " +String.format("%1.2f CHF", konto2.getSaldo()));



    }
}
