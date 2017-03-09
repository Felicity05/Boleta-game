
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

        input = JOptionPane.showInputDialog("Insert your player number. \n3-digit number");

        playerNumbers = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Insert the winning number. \n3-digit number");

        winningNumbers = Integer.parseInt(input);

        //game
        NumbersGame myGame = new NumbersGame(betType, betAmount, playerNumbers, winningNumbers);

        //getting all the data
        System.out.println("Here is your information:" + myGame.getData());

        //all the tests to see if the player win or lose 
        if ("Straight".equals(betType) || "straight".equals(betType)) //boolean method
        {
            if (myGame.IsExactOrder()) {
                amountEarned = betAmount * 600;    //player wins $600 for each $1 wagered
                System.out.printf("\nYour numbers are exactly the same ;) Congratulations, You won!!! \n\nThe amount you earned is: $%.2f ", amountEarned);
            } else {
                System.out.println("\nSorry, you lost :( Try again next time!");
            }
        } else if ("Box".equals(betType) || "box".equals(betType))// Box bet
        {
            if (myGame.IsAnyOrder()) {
                if (myGame.HasDuplicates()) {
                    amountEarned = betAmount * 200;
                    System.out.printf("\nYou have a duplicate. Congratulations, you won!!! \n\nThe amount you earned is: $%.2f ", amountEarned);
                } else {
                    amountEarned = betAmount * 100;
                    System.out.printf("\nCongratulations, You won!!! \n\nThe amount you earned is: $%.2f ", amountEarned);
                }
            } else {
                System.out.println("\nYou are not lucky today :( Sorry. Try again next time!");
            }
        } else {
            System.out.println("\nThat's not a bet type. Lo siento, Insert your bet type again");
        }
    }

}
