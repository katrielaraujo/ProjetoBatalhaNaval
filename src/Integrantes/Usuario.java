package Integrantes;

public class Usuario {

    private int changeAlpha(String row){
        if(row.equalsIgnoreCase("A")){ return 1;}
        else if(row.equalsIgnoreCase("B")){ return 2;}
        else if(row.equalsIgnoreCase("C")){ return 3;}
        else if(row.equalsIgnoreCase("D")){ return 4;}
        else if(row.equalsIgnoreCase("E")){ return 5;}
        else if(row.equalsIgnoreCase("F")){ return 6;}
        else if(row.equalsIgnoreCase("G")){ return 7;}
        else if(row.equalsIgnoreCase("H")){ return 8;}
        else if(row.equalsIgnoreCase("I")){ return 9;}
        else if(row.equalsIgnoreCase("J")){ return 10;}
        else{ return 11;}
    }

    private int changeForMatrix(int col){
        return col+1;
    }

    public void userStroke(){
        System.out.println();
    }
}
