package com.stackroute.pe3;

public class ChessBoard {
    String white,black;
    String[][] board=new String[8][8];
    public ChessBoard(){
        white="WW";
        black="BB";
    }
    public void createBoard(){
        for(int i=0;i<8;i++){
            if((i%2)==0) {
                for (int j = 0; j < 8; j++) {
                    if ((j % 2) == 0)
                        board[i][j] = white;
                    else
                        board[i][j] = black;
                }
            }
            else{
                for (int j = 0; j < 8; j++) {
                    if ((j % 2) == 0)
                        board[i][j] = black;
                    else
                        board[i][j] = white;
                }
            }
        }
    }
    public void display(){
        for (int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(board[i][j]+"|");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        ChessBoard chessBoard=new ChessBoard();
        chessBoard.createBoard();
        chessBoard.display();
    }
}
