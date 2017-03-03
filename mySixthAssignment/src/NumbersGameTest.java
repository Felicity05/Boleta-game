
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arelysalvarezpadilla
 */
public class NumbersGameTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double betAmount;
        int playerNumbers;
        int winningNumbers;
        double amountEarned;
        String input;
    
        String betType = JOptionPane.showInputDialog("Select your bet type. \n\nIt can be either \"Straight\" or \"Box\" ");
        
        input = JOptionPane.showInputDialog("Insert your bet amount");
        
        betAmount = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Insert your player numbers. \n3-digit number");
        
        playerNumbers = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Insert the winning numbers. \n3-digit number");
        
        winningNumbers = Integer.parseInt(input);
        
        //game
        NumbersGame myGame = new NumbersGame(betType, betAmount, playerNumbers, winningNumbers);
        
        
        //getting all the data
        System.out.println("Here is your information:" + myGame.getData());
        
        //System.out.println("" + myGame.GuessResult());
        
        
        if (myGame.IsStraight()) //boolean method
        {
            if (myGame.IsExactOrder()) {
                betType = "Straight";
                amountEarned = 600 * betAmount;    //player wins $600 for each $1 wagered
                System.out.printf("\nThe amount you earned is: $%.2f ", amountEarned);
            } else {
                System.out.println("\nSorry, you lost. Try again next time!");
            }
        } else // Box bet
        {
            System.out.println("Make the other method"); //boolean method 
        }
        
        
      /*  if (playerNumbers / 100 == winningNumbers / 100)     //take and compare the first digit
        {
            System.out.println("you have one match" + playerNumbers % 10 );
        }
        else if (playerNumbers % 100 == winningNumbers % 100)   //
        {
            System.out.println("estoy perdidaaaaaaaaa");
        }
        else 
        {
            System.out.println("gfffjjh");
        }*/
    }
    
    /* 456/100 cojo el 4 
       456/10 cojo el 45
       45 % 10 cojo el 5 
       456 % 10 cojo el 6 
     */
}
