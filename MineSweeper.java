/*
 * A Program that Plays Minesweeper, the Array can be modified in the start with the static ints for the Columnamount and Rowamount.
 * Of course, The game is single player,and cannot be played with two.
 * By @Jordan Hill
 * Idk why I'm even javadoccing this, but hey, it look
 */
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class MineSweeper {
    public boolean turns;
    public static boolean gamestart;
    public static boolean win;
    public static boolean lose;
    public static String player;
    public static int Rowamount = 12;
    public static int Columnamount = 12;
    public static int[][]Board = new int[Rowamount][Columnamount];
    public static void main(String[]args) {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Welcome to MineSweeper, this isn't a sterotypical coding project I swear!");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Now, lets get started, would you like to play, type Y for Yes and N for No.");
        String Answer = scan.nextLine();
        if(Answer.equals("Y")) {
            System.out.println("Alright Lets begin!");
            System.out.println("----------------------------------------------------------------------");
            Rules();
        }
        if(Answer.equals("N")) {
            System.out.println("You are an Asshole for not Playing.");
        }
    }

    public static void BoardPrinter() {
        int[][]Board = new int [Rowamount][Columnamount];
        for(int Rowamount = 0; Rowamount < 12; ++Rowamount) {
            System.out.print("------------------------");
            System.out.println();
            for(int Columnamount = 0; Columnamount < 12; ++Columnamount) 
                System.out.print(Board[Rowamount][Columnamount] + "|" );
            System.out.println();

        }
    }

    public static void Rules() {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Before You start the game, if you have not played minesweeper, rules will be explained.");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("The Idea of the Game is simple, reveal all the Blocks in the Board, but do not uncover any mines.");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Mines will look like this: #, and once one is revealed, and it is adjacent to the number block, the game ends.");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("If you avoid all the mines, and Successfully Reveal all the Number Blocks, that look like this: |2|, |1|, |3|, etc.");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Once this Objective is completed, you win the game, giving if you have avoided all the mines successfully.");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Now, with all the rules explained, please type in Y or N if you wish to continue.");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        String Answer = scan.next();
        if(Answer.equals("Y")) {
            System.out.println("The Game Shall Continue Now, Enjoy.");      
            gamestart();
        }
        if(Answer.equals("N")) {
            System.out.println("Ok, the game shall now end.");
        }
    }

    public static void gamestart() {
        boolean gamestart = true;
        while(gamestart = true) {
            Scanner scan;
            BoardPrinter();
            break;
        }
    }

    public static void PlayerNumberRange() {
        Scanner scan;
        scan = new Scanner(System.in);
        int Arrayspot1 = scan.nextInt();
        int Arrayspot2 = scan.nextInt();
        System.out.println("Ok, Please type the range of Numbers, two numbers, min and max, you would like the number blocks to be, have it be less than or equal to 100.");
        if(Arrayspot1 <= 100 && Arrayspot2 <= 100) {
            System.out.println("You have typed" + " " + Arrayspot1 + " " + "as your minimum," + " " + "and as your maximum you typed" + " " + Arrayspot2);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
            System.out.println("Now, please type Y or N to confirm this number range.");
            String Answer = scan.next();
            if(Answer.equals("Y")) {
                System.out.println("Confirmed Number range");
                boolean range = true;
                gamestart();
            }
            if(Answer.equals("N")) {
                System.out.println("Sorry for the Error, since i can't code a function like it, please restart the program and come back here and type another Range.");
                boolean range = false;
                while(range = false || Answer.equals("N")) {
                    System.out.println("The Program has ended due to a mathematical error, you will have to restart the entire program.");
                    break;
                }
            }
        }
    }
}