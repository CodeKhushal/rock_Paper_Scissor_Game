package com.company;
import java.util.Scanner;
import java.util.Random;

public class rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("           Rock, Paper and Scissor......      ");
        System.out.print("Enter your name to continue: ");
        String name = sc.nextLine();
        System.out.println("----------Welcome! "+name+"-----------");
        System.out.print("Enter number of rounds you want to play: ");
        int num = sc.nextInt();
        System.out.println("Let's Begin!\n\n");
        Random r = new Random();
        int option,player=0 ;
        int comp,opponent=0 ;
        for(int i = 1;i<=num;i++) {
            System.out.println("           (Round - "+i+")");
            System.out.print(name+",\nEnter 0 for Rock, Enter 1 for paper, Enter 2 for scissor: ");
            option = sc.nextInt(3);
            comp = r.nextInt(3);
            if (option == 0 && comp ==1)
            {
                opponent++;
                System.out.println(name+": Rock\tBot: Paper");
                System.out.println("You lose!");
                System.out.println("Your score: "+player+"\tOpponent's score: "+opponent);
                System.out.println();
            }
            else if(option==1 && comp==2)
            {
                opponent++;
                System.out.println(name+": Paper\tBot: Scissor");
                System.out.println("You lose!");
                System.out.println("Your score: "+player+"\tOpponent's score: "+opponent);
                System.out.println();
            }
            else if(option==2 && comp==0)
            {
                opponent++;
                System.out.println(name+": Scissor\tBot: Rock");
                System.out.println("You lose!");
                System.out.println("Your score: "+player+"\tOpponent's score: "+opponent);
                System.out.println();
            }
            else if(option==0 && comp==2)
            {
                player++;
                System.out.println(name + ": Rock\tBot: Scissor");
                System.out.println("You won!");
                System.out.println("Your score: "+player+"\tOpponent's score: "+opponent);
                System.out.println();
            }
            else if(option==1 && comp==0)
            {
                player++;
                System.out.println(name+": Paper\tBot: Rock");
                System.out.println("You won!");
                System.out.println("Your score: "+player+"\tOpponent's score: "+opponent);
                System.out.println();
            }
            else if(option==2 && comp==1)
            {
                player++;
                System.out.println(name+": Scissor\tBot: Paper");
                System.out.println("You won!");
                System.out.println("Your score: "+player+"\tOpponent's score: "+opponent);
                System.out.println();
            }
            else if(option==opponent)
            {
                player++;
                opponent++;
                if(option==0 && comp==0)
                {
                    System.out.println(name + ": Rock\tBot: Rock");
                }
                else if(option==1 && comp==1)
                {
                    System.out.println(name + ": Paper\tBot: Paper");
                }
                else if(option==2 && comp==2)
                {
                    System.out.println(name + ": Scissor\tBot: Scissor");
                }
                System.out.println("Draw!");
                System.out.println("Your score: " + player + "\tOpponent's score: " + opponent);
                System.out.println();
            }
        }
        System.out.println("\n\n--------------------------------------------------------------");
        System.out.println("Your score is: "+player+"\tOpponent's score is: "+opponent);
        if(player>opponent)
            System.out.println("You won!\nYou won opponent by: "+(player-opponent)+" points, Congratulations!");
        else if (opponent>player)
            System.out.println("You lose!, You lose opponent by: "+(opponent-player)+" points, Try again!");
        else if (opponent==player)
            System.out.println("Match Draw! Try again!");
        System.out.println();
        System.out.println("------------------Thank You "+name+"!---------------------");
    }
}
