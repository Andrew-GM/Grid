package battleboard;
import java.util.Scanner;
import java.util.Random;

public class BattleBoard {
    public static String[][] BoardMethod(){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String [][] board = new String[10][10];
        
        for (int i = 0; i <10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = "□";
            }
        }
        return board;
    } 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        String ActualBoard[][] = BoardMethod();
        
        for (int i=0; i<10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(ActualBoard[i][j]);
            }
            System.out.println("");
        }
        
        boolean x =true;
        while (x == true){
            System.out.println("Enter your x co-ordinates between 1 and 10");
            int xco = input.nextInt()-1;
            System.out.println("Enter your y co-ordinates 1 and 10");
            int yco = input.nextInt()-1;
            x = false;
            try {
                String ERR0R = ActualBoard[xco][yco];
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("you have entered an invalid number");
                System.out.println("Please enter two numbers between 1 and 10");
                x = true;
            }
        }
        System.out.println("You have entered the coordinates correctly.");

    }
    
}
