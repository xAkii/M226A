package mastermind;

import java.util.ArrayList;


public class GuessResult {
    private ArrayList<Peg> totallyCorrect;
    private ArrayList<Peg> onlyValuesCorrect;


    public GuessResult() {
        this.totallyCorrect = new ArrayList<>();
        this.onlyValuesCorrect = new ArrayList<>();
    }


    public ArrayList<Peg> getTotallyCorrect() {
        return totallyCorrect;
    }


    public ArrayList<Peg> getOnlyValuesCorrect() {
        return onlyValuesCorrect;
    }


    public boolean isGuessed(int codeLength) {
        return (this.totallyCorrect.size() == codeLength);
    }


    public void setTotallyCorrect(int size) {
        for (int i = 0; i < size; i++) {
            this.totallyCorrect.add(new Peg(Colors.RED));
        }
    }


    public void setOnlyValuesCorrect(int size) {
        for (int i = 0; i < size; i++) {
            this.onlyValuesCorrect.add(new Peg(Colors.WHITE));
        }
    }


    public boolean equals(Object o) {
        return ((this.totallyCorrect.size() == ((GuessResult) o).getTotallyCorrect().size()) && (this.onlyValuesCorrect.size() == ((GuessResult) o).getOnlyValuesCorrect().size()));
    }

    @Override
    public int hashCode() {
        return 2 * this.totallyCorrect.size() + 3 * this.onlyValuesCorrect.size();
    }

    @Override
    public String toString() {
        StringBuilder guessResult = new StringBuilder();
        //Display rote pins
        this.getTotallyCorrect().forEach((redPeg) -> {
            guessResult.append(redPeg.getColoredPeg());
        });

        //Display weisse pins
        this.getOnlyValuesCorrect().forEach((whitePeg) -> {
            guessResult.append(whitePeg.getColoredPeg());
        });

        return guessResult.toString();
    }
}


