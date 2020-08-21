package mastermind;


public class ColorNotFoundException extends Exception {


    public ColorNotFoundException() {
    }

    public ColorNotFoundException(char c){
        super(c+ " ist keine gültige Farbe");
    }


    public ColorNotFoundException(String msg) {
        super(msg);
    }
}