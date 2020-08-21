package mastermind;

import java.util.ArrayList;



public class Code{
    private ArrayList<Peg> pegs;


    public Code() {
        this.pegs = new ArrayList();
    }


    public Code(Code code){
        this.pegs = new ArrayList();
        code.pegs.forEach((tmp) -> {
            this.pegs.add(new Peg(tmp));
        });
    }


    public Code(int[] code){
        this.pegs = new ArrayList();
        for(int i : code){
            this.pegs.add(new Peg(Colors.getColor(i)));
        }
    }


    public void addPeg(Peg peg){
        this.pegs.add(peg);
    }


    public ArrayList<Peg> getCode(){
        return this.pegs;
    }


    public Peg getPeg(int index){
        return this.pegs.get(index);
    }


    public boolean equals(Code code){
        boolean equals = true;
        for(int i=0;i<this.pegs.size();i++){
            if(!this.pegs.get(i).equals(code.getCode().get(i))) equals = false;
        }
        return equals;
    }


    public int contains(Peg pegToCheck){
        int index = -1;
        for(Peg peg:this.pegs){
            if(peg.equals(pegToCheck)) index = this.getPegIndex(peg);
        }
        return index;
    }


    public int getPegIndex(Peg peg){
        return this.pegs.indexOf(peg);
    }

    public int getCodeLength(){
        return this.pegs.size();
    }

    @Override
    public String toString(){
        StringBuilder code = new StringBuilder();
        for(Peg peg: this.pegs){
            code.append(peg.getColoredPeg());
        }
        return code.toString();
    }

}