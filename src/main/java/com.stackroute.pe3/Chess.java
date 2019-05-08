package com.stackroute.pe3;



public class Chess {
    String white,black;
    String[][] b=new String[8][8];
    public Chess(){
        white="WW";
        black="BB";
    }
    public void board(){
        for(int i=0;i<8;i++){
            if((i%2)==0) {
                for (int j = 0; j < 8; j++) {
                    if ((j % 2) == 0)
                        b[i][j] = white;
                    else
                        b[i][j] = black;
                }
            }
            else{
                for (int j = 0; j < 8; j++) {
                    if ((j % 2) == 0)
                        b[i][j] = black;
                    else
                        b[i][j] = white;
                }
            }
        }
    }
    public void display(){
        for (int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(b[i][j]+"|");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Chess cBoard=new Chess();
        cBoard.board();
        cBoard.display();
    }
}