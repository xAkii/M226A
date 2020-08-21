package Bank;


public class Konto {

    private double saldo;



    public  void einzahlen(double einzahlung, double konto){
        saldo = konto + einzahlung;
    }
    public void verzinsen(double zinssatz, int laufzeit){
        double zins = 0;
        zinssatz = zinssatz / 100;
        zins = saldo * zinssatz * laufzeit / 365;
        saldo = saldo + zins;
    }
    public double getSaldo(){
        return saldo;
    }
}
