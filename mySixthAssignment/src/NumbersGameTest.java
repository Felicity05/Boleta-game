
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
        
      
        string       
        boolean goodNumb = String.format("%3d", input);
        
        
        //game
        NumbersGame myGame = new NumbersGame(betType, betAmount, playerNumbers, winningNumbers);
        
        
        //getting all the data
        System.out.println("Here is your information:" + myGame.getData());
        
          
        
        
        //all the tests to see if the player win or lose 
        if (myGame.IsStraight()) //boolean method
        {
            if (myGame.IsExactOrder()) {
                betType = "Straight";
                amountEarned = 600 * betAmount;    //player wins $600 for each $1 wagered
                System.out.printf("\nCongratulations, You win!!! \n\nThe amount you earned is: $%.2f ", amountEarned);
            } else {
                System.out.println("\nSorry, you lost. Try again next time!");
            }
        } else // Box bet
        {
            if (myGame.IsAnyOrder())
            {
                betType = "Box";
                if (myGame.HasDuplicates())
                {
                amountEarned = betAmount * 200;
                System.out.printf("\nCongratulations, You win!!! \n\nThe amount you earned is: $%.2f ", amountEarned);
                }
                else 
                {
                amountEarned = betAmount * 100;
                System.out.printf("\nCongratulations, You win!!! \n\nThe amount you earned is: $%.2f ", amountEarned);   
                }
            }
            else 
            {
                System.out.println("\nYou are not lucky today :( Sorry. Try again next time!");
            }
        }
    }
   
}
