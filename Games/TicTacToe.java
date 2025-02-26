package Games;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        char[][] board = new char[3][3];
        for(int rows = 0; rows < board.length; rows++){
            for(int column = 0; column < board[rows].length; column++){
                board[rows][column] = ' ';
            }
        }
        char player = 'X';
        boolean gameOver = false;

        Scanner sc = new Scanner(System.in);
        while(!gameOver){
            printBoard(board);
            System.out.println("Player " + player + " enter: ");
            int row = sc.nextInt();
            int column = sc.nextInt();
            if(board[row][column] == ' '){
                board[row][column] = player;
                gameOver = hasWon(board,player);
                if(gameOver){
                    System.out.println("Player " + player + " has won!");
                }else{
                    player = (player == 'X') ? 'O' : 'X';
                }
            }else{
                System.out.println("Invalid mov. Try again!");
            }
        }
    }
    public static void printBoard(char[][] board){
        for(int rows = 0; rows < board.length; rows++){
            for(int column = 0; column < board[rows].length; column++){
                System.out.print(board[rows][column] + " | ");
            }
            System.out.println();
        }
    }
    public static Boolean hasWon(char[][] board,char player){
        //Check for rows
        for(int rows = 0; rows < board.length; rows++){
            if(board[rows][0] == player && board[rows][1] == player && board[rows][2] == player){
                return true;
            }
        }
        //Check for column
        for(int column = 0; column < board.length; column++){
            if(board[0][column] == player && board[1][column] == player && board[2][column] == player){
                return true;
            }
        }
        //Diagonal
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }
}
