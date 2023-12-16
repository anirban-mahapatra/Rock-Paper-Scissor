//WRITE A JAVA PROGRAM TO COMPUTE ROCK, PAPER, SCISSOR GAME.

import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int comscore=0;
        int yoscore=0;
        int i=0;
        while(i<5) {
            int com = rand.nextInt(3);
            System.out.println("\nRound left: "+(5-i));
            System.out.print("\n0 FOR ROCK\n1 FOR PAPER\n2 FOR SCISSOR\nEnter your choice: ");
            int cho = sc.nextInt();

            if ((cho==0 && com==0)||(cho==1 && com==1)||(cho==2 && com==2)){
                System.out.println("\nDraw\nComputer input="+com);
            }
            else if ((cho==0 && com==1)||(cho==1 && com==2)||(cho==2 && com==0)){
                comscore=comscore+1;
                System.out.println("\nComputer win\nComputer input="+com);
            }
            else if((cho==0 && com==2)||(cho==1 && com==0)||(cho==2 && com==1)){
                yoscore=yoscore+1;
                System.out.println("\nYou win\nComputer input="+com);
            }
            else {
                System.out.println("\nWrong Input");
                i--;
            }
            System.out.println("\nComputer score= "+comscore+"\nYour score= "+yoscore);
            i++;
        }
        if(yoscore>comscore){
            System.out.println("\n\nCONGRATULATION, YOU WON THE GAME");
        }
        else if(comscore>yoscore){
            System.out.println("\n\nSORRY, YOU LOST THE GAME\nCOMPUTER WIN");
        }
        else {
            System.out.println("\n\nGAME DRAW");
        }
    }
}
