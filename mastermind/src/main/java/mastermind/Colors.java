package mastermind;


public enum Colors {

    None,
    RED,
    GREEN,
    BLUE,
    YELLOW,
    WHITE,
    BLACK;


    public static Colors getColor(int index){
        return Colors.values()[index];
    }

    public static Colors getColor(char c) throws ColorNotFoundException{
        Colors color;
        switch(c){
            case 'R':
            case 'r':
                color = Colors.RED;
                break;
            case 'G':
            case 'g':
                color = Colors.GREEN;
                break;
            case 'B':
            case 'b':
                color = Colors.BLUE;
                break;
            case 'Y':
            case 'y':
                color = Colors.YELLOW;
                break;
            case 'W':
            case 'w':
                color = Colors.WHITE;
                break;
            case 'S':
            case 's':
                color = Colors.BLACK;
                break;

            default: throw new ColorNotFoundException(c);
        }
        return color;
    }


}