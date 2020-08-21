package mastermind;


public class Peg {
    private Colors color;


    public Peg(Colors color){
        this.color = color;
    }


    public Peg(Peg peg){
        this.color = peg.color;
    }


    public Colors getColor() {
        return color;
    }


    public void setColor(Colors color){
        this.color = color;
    }


    public String getColoredPeg(){
        String coloredPeg = "";
        switch(this.color){
            case RED:
                coloredPeg = "\33[31m\u25C9\33[0m";
                break;
            case GREEN:
                coloredPeg = "\33[32m\u25C9\33[0m";
                break;
            case BLUE:
                coloredPeg = "\33[34m\u25C9\33[0m";
                break;
            case YELLOW:
                coloredPeg = "\33[33m\u25C9\33[0m";
                break;
            case WHITE:
                coloredPeg = "\33[30m\u25C9\33[0m";
                break;
            case BLACK:
                coloredPeg = "\33[37m\u25C9\33[0m";
                break;

        }

        return coloredPeg;
    }


    public boolean equals(Peg peg){
        return (this.color.equals(peg.getColor()));
    }




}